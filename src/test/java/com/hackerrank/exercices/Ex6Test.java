package com.hackerrank.exercices;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ex6Test {


    @Test
    void test() {
        List<Integer> integers = List.of(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 98, 99, 2, 3, 4, 5, 6);
        Ex6.Result.countingSort(integers);

    }

}