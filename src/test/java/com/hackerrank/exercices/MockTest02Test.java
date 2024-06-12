package com.hackerrank.exercices;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockTest02Test {

    @Test
    void test() {

        List<Integer> l = new ArrayList<>();
        l.add(32);
        l.add(3);
        l.add(1);
        l.add(33);

        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(9);
        l1.add(56);
        l1.add(90);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(5);
        l2.add(50);
        l2.add(70);

        List<Integer> l3 = new ArrayList<>();
        l3.add(32);
        l3.add(51);
        l3.add(40);
        l3.add(40);


        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(l);
        matriz.add(l1);
        matriz.add(l2);
        matriz.add(l3);

        MockTest02.Result.flippingMatrix(matriz);

    }

}