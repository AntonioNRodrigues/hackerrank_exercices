package com.hackerrank.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MockTest03Test {

    @Test
    void test() {
        int resul = MockTest03.Result.palindromeIndex("aa4aa");
        Assertions.assertEquals(-1, resul);

    }@Test
    void test2() {

        int resul = MockTest03.Result.palindromeIndex("aa4ab");
        Assertions.assertEquals(1, resul);

    }@Test
    void test3() {

        int resul = MockTest03.Result.palindromeIndex("aa4cb");
        Assertions.assertEquals(0, resul);

    }@Test
    void test4() {

        int resul = MockTest03.Result.palindromeIndex("aaab");
        Assertions.assertEquals(3, resul);

    }

}