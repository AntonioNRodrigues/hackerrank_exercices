package com.hackerrank.exercices;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Ex4 {

    /*
            Given an array of integers, where all elements but one occur twice, find the unique element.

        Example

        The unique element is .

        Function Description

        Complete the lonelyinteger function in the editor below.

        lonelyinteger has the following parameter(s):

        int a[n]: an array of integers
        Returns

        int: the element that occurs only once
        Input Format

        The first line contains a single integer, , the number of integers in the array.
        The second line contains  space-separated integers that describe the values in .

        Constraints

        It is guaranteed that  is an odd number and that there is one unique element.
        , where .
     */


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }


    class Result {

        /*
         * Complete the 'lonelyinteger' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY a as parameter.
         */

        public static int lonelyinteger(List<Integer> a) {

            int uniqueValue = 0;
            Map<Integer, Integer> map = new HashMap<>(); // value per count

            a.forEach(x -> {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            });

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    uniqueValue = entry.getKey();
                    break;
                }
            }

            return uniqueValue;
        }
    }

}
