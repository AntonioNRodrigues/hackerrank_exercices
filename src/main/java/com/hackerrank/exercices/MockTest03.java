package com.hackerrank.exercices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MockTest03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }


    class Result {

        /*
         * Complete the 'palindromeIndex' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int palindromeIndex(String s) {
            List<String> left = new ArrayList<>();
            List<String> right = new ArrayList<>();

            int middle = s.length() / 2;
            for (int i = 0; i < middle; i++) {
                left.add(String.valueOf(s.charAt(i)));
            }
            // odd word
            if (s.length() % 2 != 0) {
                middle = middle + 1;
            }
            for (int i = middle; i < s.length(); i++) {
                right.add(String.valueOf(s.charAt(i)));
            }

            for (int i = 0; i < left.size(); i++) {
                if (!left.get(i).equals(right.get(i))) {
                    return i;
                }
            }

            return -1;

        }

    }
}
