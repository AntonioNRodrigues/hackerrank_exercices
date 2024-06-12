package com.hackerrank.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex8Test {
    Ex8 ex8 = new Ex8();


    @Test
    void test() {

        int result = Ex8.Result.towerBreakers(2, 2);
        Assertions.assertEquals(2, result);
    }

    @Test
    void test1() {
        int result = Ex8.Result.towerBreakers(1, 7);
        Assertions.assertEquals(1, result);

    }

    @Test
    void test2() {
        int result = Ex8.Result.towerBreakers(3, 7);
        Assertions.assertEquals(1, result);

    }

    @Test
    void test3() {
        int result = Ex8.Result.towerBreakers(1, 4);
        Assertions.assertEquals(1, result);

    }

}