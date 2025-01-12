package com.hackerrank.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex10Test {


    @Test
    void test() {

        String resultChipher = Ex10.Result.isBalanced("(())");
        Assertions.assertEquals("YES", resultChipher);

    }

    @Test
    void test2() {

        String resultChipher = Ex10.Result.isBalanced("(wefew(efw)wefewf){efwwe}");
        Assertions.assertEquals("YES", resultChipher);

    }

    @Test
    void test4() {

        String resultChipher = Ex10.Result.isBalanced("(wefew(efw)wefewf){efwwe}{");
        Assertions.assertEquals("NO", resultChipher);

    }  @Test
    void test5() {

        String resultChipher = Ex10.Result.isBalanced("}][}}(}][))]");
        Assertions.assertEquals("NO", resultChipher);

    }

}