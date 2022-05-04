package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_2Test {

    public Task_2Test() {
    }

    @Test
    public void testGrepForth() {
        System.out.println("Cut after 4");
        int[] array = { 1, 2, 4, 4, 2, 3, 4, 5, 9, 1, 7 };
        Task_2 instance = new Task_2(array, 4);
        int[] expResult = { 5, 9, 1, 7};
        int[] result = instance.grepForth(array);
        assertArrayEquals(expResult, result);
        System.out.println("Cut after 4");
        int[] array2 = {  4, 5, 9, 1, 6, 4, 7 };
        Task_2 instance2 = new Task_2(array2, 4);
        int[] expResult2 = {  7};
        int[] result2= instance2.grepForth(array2);
        assertArrayEquals(expResult2, result2);
        //   fail("The test case is a prototype.");
    }

    @Test
    public void testIsPesent_4or1() {
        System.out.println("find 4");
        int[] array = { 4, 2, 1, 2, 3, 5, 9, 7 };
        boolean result = new Task_2(array, 4).isPresent() |
                new Task_2(array, 1).isPresent(); // если есть 1 или 4 вернет TRUE
        Assertions.assertTrue(result);
        //   fail("The test case is a prototype.");
    }

    @Test
    public void test_2_IsPesent_4() {
        System.out.println("find 4");
        int[] array = { 4, 2, 2, 3, 5, 9, 7 };
        boolean result = new Task_2(array, 4).isPresent(); // если есть  4 вернет TRUE
        Assertions.assertTrue(result);
        //   fail("The test case is a prototype.");
    }

    @Test
    public void test_3_IsPesent_1() {
        System.out.println("find 4");
        int[] array = { 2, 2, 1, 3, 5, 9, 7 };
        boolean result = new Task_2(array, 1).isPresent(); // если есть 1 вернет TRUE
        Assertions.assertTrue(result);
        //   fail("The test case is a prototype.");
    }
}
