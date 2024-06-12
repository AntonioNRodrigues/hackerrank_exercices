package com.hackerrank.exercices;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Ex8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]); // number of towers

                int m = Integer.parseInt(firstMultipleInput[1]); // height of tower

                int result = Result.towerBreakers(n, m);
                System.out.println(result);

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
         * Complete the 'towerBreakers' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n -> number of towers
         *  2. INTEGER m > height of tower
         */

        public static int towerBreakers(int n, int m) {
            boolean gamesHasNotEnded = true;
            int winner = 1; // first player return 1 || second player return 2
            int towerHeight = m;

            List<List<Integer>> boardList = initList(n, m);
            System.out.println(boardList);
            boolean playerHasPlayed = false;

            int currentPlayer = 1;
            while (gamesHasNotEnded) {
                boardList.sort((x, y) -> (x.size() < y.size()) ? 1 : ((x.size() == y.size()) ? 0 : -1));
                System.out.println(boardList);
                for (List<Integer> list : boardList) {
                    if (!list.isEmpty()) {

                        int numberToRemove = Result.calculateTheNumberOfPiecesToRemoveFromList(list, towerHeight);

                        if (numberToRemove >= 0) {
                            // found the number to remove from list
                            // remove from current list the number of pieces
                            for (int i = 0; i < numberToRemove; i++) {
                                list.remove(i);
                            }

                            playerHasPlayed = true;
                            break;
                        }
                    }
                }
                if (!playerHasPlayed) {
                    gamesHasNotEnded = false;
                }else{
                    playerHasPlayed = false;
                    currentPlayer = currentPlayer == 1 ? 2 : 1;
                }

            }
            winner = currentPlayer == 1 ? 2 : 1;
            System.out.println(winner);
            return winner;
        }

        private static final Comparator<List<Integer>> customComparator = (x, y) -> (x.size() < y.size()) ? 1 : ((x.size() == y.size()) ? 0 : -1);

        private static List<List<Integer>> initList(int n, int m) {
            List<List<Integer>> board = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                List<Integer> queue = new ArrayList<>(m);
                for (int j = 0; j < m; j++) {
                    queue.add(1);
                }
                board.add(queue);

            }
            return board;
        }

        private static int calculateTheNumberOfPiecesToRemoveFromList(List<Integer> queueInValidation, int towerHeight) {
            int beginValidation = queueInValidation.size() - 1;
            int numberOfPiecesToRemoveFromQueue = -100;
            if (beginValidation <= 0) {
                return -1;
            }

            while (numberOfPiecesToRemoveFromQueue == -100) {

                if (towerHeight % beginValidation == 0) {
                    numberOfPiecesToRemoveFromQueue = beginValidation;
                }
                beginValidation = beginValidation - 1;

            }

            return numberOfPiecesToRemoveFromQueue >= 0 ? numberOfPiecesToRemoveFromQueue : -1;
        }
    }

}
