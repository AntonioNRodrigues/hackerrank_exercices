package com.hackerrank.exercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Ex9Test {
    Ex9 ex8 = new Ex9();


    @Test
    void test() {

        String resultChipher = Ex9.Result.caesarCipher("abcdef", 1);
        Assertions.assertEquals("bcdefg", resultChipher);

    }

    @Test
    void test2() {

        String resultChipher = Ex9.Result.caesarCipher("abcdez", 1);
        Assertions.assertEquals("bcdefa", resultChipher);

    }
    @Test
    void test5() {

        String resultChipher = Ex9.Result.caesarCipher("abcdez", 1);
        Assertions.assertEquals("bcdefa", resultChipher);

    }@Test
    void test4() {

        String resultChipher = Ex9.Result.caesarCipher("ab cdez --", 1);
        Assertions.assertEquals("bc defa --", resultChipher);

    }@Test
    void test3() {

        String resultChipher = Ex9.Result.caesarCipher("ab cdez --", 1);
        Assertions.assertEquals("bc defa --", resultChipher);

    }
    @Test
    void test6() {

        String resultChipher = Ex9.Result.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5);
        Assertions.assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", resultChipher);

    }

}