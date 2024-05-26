package com.hackerrank.exercices;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Ex5Test {

    @Test
    public void test1() {
        List<List<Integer>> col = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        n.add(11);
        n.add(2);
        n.add(4);
        List<Integer> n2 = new ArrayList<>();
        n2.add(4);
        n2.add(5);
        n2.add(6);

        List<Integer> n3 = new ArrayList<>();
        n3.add(10);
        n3.add(8);
        n3.add(-12);
        col.add(n);
        col.add(n2);
        col.add(n3);

        int result = Ex5.Result.diagonalDifference(col);
        assertEquals(15, result);
    }

}