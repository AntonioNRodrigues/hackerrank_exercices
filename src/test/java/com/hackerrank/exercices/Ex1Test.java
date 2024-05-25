package com.hackerrank.exercices;

import org.junit.jupiter.api.Test;

import java.util.List;

class Ex1Test {

    @Test
    void test() {

        Ex1.Result.plusMinus(List.of(0, 1, -1, 0, 0));
        Ex1.Result.plusMinus(List.of(0, 1, -1, 1, 0));
    }

}