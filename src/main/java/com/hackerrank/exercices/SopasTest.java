package com.hackerrank.exercices;


import java.util.Scanner;

public class SopasTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Result.solve(10.25, 17, 5);

        int i = 4;
        float d = 4.0f;
        StringBuilder s = new StringBuilder("HackerRank ");

        Scanner sc = new Scanner(System.in);
        int ii = sc.nextInt();
        System.out.println(i + ii);
        float ff = sc.nextFloat();
        System.out.println(ff + d);

        double f = 0.0;
        int ds = (int) (f + ii);

        while (sc.hasNext()) {
            s.append(sc.next());
        }
        System.out.println(s);


    }

    class Result {

        /*
         * Complete the 'solve' function below.
         *
         * The function accepts following parameters:
         *  1. DOUBLE meal_cost
         *  2. INTEGER tip_percent
         *  3. INTEGER tax_percent
         */

        public static void solve(double meal_cost, int tip_percent, int tax_percent) {
            // Write your code here

            double tip = (meal_cost / 100.0) * tip_percent;
            double tax = (tax_percent / 100.0) * meal_cost;

            double totalCost2 = (meal_cost + tip + tax);
            int totalCost = (int) Math.round(totalCost2);

            System.out.println(totalCost);

        }

    }
}


