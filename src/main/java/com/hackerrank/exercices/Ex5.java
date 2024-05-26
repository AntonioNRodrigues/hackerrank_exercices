package com.hackerrank.exercices;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Ex5 {
        /*
        Given a square matrix, calculate the absolute difference between the sums of its diagonals.

        For example, the square matrix  is shown below:

        1 2 3
        4 5 6
        9 8 9
        The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

        Function description

        Complete the  function in the editor below.

        diagonalDifference takes the following parameter:

        int arr[n][m]: an array of integers
        Return

        int: the absolute diagonal difference
        Input Format

        The first line contains a single integer, , the number of rows and columns in the square matrix .
        Each of the next  lines describes a row, , and consists of  space-separated integers .

        Constraints

        Output Format

        Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

        Sample Input

        3
        11 2 4
        4 5 6
        10 8 -12
        Sample Output

        15
        Explanation

        The primary diagonal is:

        11
           5
             -12
        Sum across the primary diagonal: 11 + 5 - 12 = 4

        The secondary diagonal is:

             4
           5
        10
        Sum across the secondary diagonal: 4 + 5 + 10 = 19
        Difference: |4 - 19| = 15

        Note: |x| is the absolute value of x
 */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            int normalDiagonal = 0;
            int reverseDiagonal = 0;

            normalDiagonal = iterateOverList(arr, normalDiagonal);

            arr.forEach(Collections::reverse);

            reverseDiagonal = iterateOverList(arr, reverseDiagonal);

            return Math.abs(normalDiagonal - reverseDiagonal);
        }

        private static int iterateOverList(List<List<Integer>> arr, int normalDiagonal) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.get(i).size(); j++) {
                    if (i == j) {
                        normalDiagonal += arr.get(i).get(j);
                    }
                }
            }
            return normalDiagonal;
        }

    }

}
