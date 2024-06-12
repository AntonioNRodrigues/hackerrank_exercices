package com.hackerrank.exercices;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex9 {

    /*
    *
    * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

                Original alphabet:      abcdefghijklmnopqrstuvwxyz
                Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
                Example


                The alphabet is rotated by , matching the mapping above. The encrypted string is .

                Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

                Function Description

                Complete the caesarCipher function in the editor below.

                caesarCipher has the following parameter(s):

                string s: cleartext
                int k: the alphabet rotation factor
                Returns

                string: the encrypted string
                Input Format

                The first line contains the integer, , the length of the unencrypted string.
                The second line contains the unencrypted string, .
                The third line contains , the number of letters to rotate the alphabet by.

                Constraints



                 is a valid ASCII string without any spaces.

                Sample Input

                11
                middle-Outz
                2
                Sample Output

                okffng-Qwvb
                Explanation

                Original alphabet:      abcdefghijklmnopqrstuvwxyz
                Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab

                m -> o
                i -> k
                d -> f
                d -> f
                l -> n
                e -> g
                -    -
                O -> Q
                u -> w
                t -> v
                z -> b
                    *
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    class Result {

        private static final ArrayList<Character> alphabet = initAlphabet('a');
        private static final ArrayList<Character> alphabetCapLetter = initAlphabet('A');

        private static ArrayList<Character> initAlphabet(char initLetter) {
            ArrayList<Character> alphabet = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                alphabet.add((char) (initLetter + i));
            }
            return alphabet;
        }


        /*
         * Complete the 'caesarCipher' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. STRING s
         *  2. INTEGER k
         */

        public static String caesarCipher(String s, int k) {

            StringBuilder cipherWord = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {

                if (alphabet.contains(s.charAt(i)) || alphabetCapLetter.contains(s.charAt(i))) {
                    List<Character> l = alphabet.contains(s.charAt(i)) ? alphabet : alphabetCapLetter;
                    int indexOfCharInAlphabet = l.indexOf(s.charAt(i));

                    int chipherIndex = indexOfCharInAlphabet + k;

                    while (chipherIndex >= l.size()){
                        chipherIndex = chipherIndex - l.size();
                    }

                    Character c = l.get(chipherIndex);
                    cipherWord.append(c);
                } else {
                    cipherWord.append(s.charAt(i));
                }
            }
            System.out.println(alphabet);
            System.out.println(alphabetCapLetter);
            return cipherWord.toString();

        }
    }
}
