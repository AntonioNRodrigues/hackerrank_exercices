package com.hackerrank.exercices;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int numberOfTestCases = sc.nextInt();


        for (int i =0 ; i< numberOfTestCases; i++){
            Solution.Person p = new Person(sc.nextInt());
            p.amIOld();

        }

    }

    static class Person{
        private int age;

        public Person(int initialAge){
            this.age = validateAge(initialAge);

        }

        private int validateAge(int initialAge){
            if (initialAge <0){
                System.out.println("Age is not valid, setting age to 0.");
                return 0;
            }else{
                return initialAge;
            }
        }
        public void yearPasses(){
            this.age += 1;
        }
        public void amIOld(){
            if (this.age < 13){
                System.out.println("You are young.");
            }else if (this.age >=13 && this.age < 18){
                System.out.println("You are teenager.");
            }
            else{
                System.out.println("You are old.");
            }
        }
    }
}