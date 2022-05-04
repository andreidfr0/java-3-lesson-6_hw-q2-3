package org.example;
//TODO 2. Написать метод, которому в качестве аргумента передается не пустой одномерный
// целочисленный массив. Метод должен вернуть новый массив, который получен путем
// вытаскивания из исходного массива элементов, идущих после последней четверки.
// Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо
// выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта
// входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

public class Task_2 {
    private int forch;
    private int[] testadArray;
    private boolean bingo = false; // флаг совпадения при поиске
    private int count = 0;

    public Task_2(){}

    public Task_2(int[] arr, int t) {  // int t -- число которое ищем
        this.testadArray = arr;
        this.forch = t;
    }

    public int[] grepForth(int[] array) throws RuntimeException {
        //TODO 2. Написать метод, которому в качестве аргумента передается не пустой одномерный
        // целочисленный массив. Метод должен вернуть новый массив, который получен путем
        // вытаскивания из исходного массива элементов, идущих после последней четверки.
        // Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо
        // выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта
        // входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]. grepForch(Array)
        boolean isLast = false;
        int[] newArrays = new int[array.length];
        this.count = 0;
        for (int i = 0, j = -1; i < array.length; i++) {
            try {
                if (array[i] == forch) { // если искомое нашли еще раз
                    isLast = false; // флаг isLast = FALSE
                    this.bingo = true; //если есть искомое установить флаг в TRUE
                    j = (i + 1);
                    newArrays = new int[array.length - j];
                    this.count = this.count + 1;
                } else isLast = true; // если это последнее совпадение то TRUE
                if (!isLast) {
                    System.arraycopy(array, j, newArrays, 0, array.length - j);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Не верный размер индекса массива.");
            }
        }
        if (count == 0) throw new RuntimeException("не найдено совпадений c : " + forch);
        return newArrays;
    }

    //3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет
    // хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для
    // этого метода (по 3-4 варианта входных данных). isPresent()
    public boolean isPresent() {
        grepForth(testadArray);
        return bingo;
    }

}
