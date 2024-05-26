package com.hackerrank.exercices;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Ex3 {

    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            System.out.println("s = " + s);
            SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");

            SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
            Date date = null;
            try {
                date = parseFormat.parse(s);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return displayFormat.format(date);
        }

    }


    public static void main(String[] args) throws IOException {

        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = bufferedReader.readLine();
        String s = "12:00 PM";
        String result = Result.timeConversion(s);
        System.out.println(result);

     //  bufferedWriter.write(result);
     //  bufferedWriter.newLine();

     //  bufferedReader.close();
     //  bufferedWriter.close();
    }
}
