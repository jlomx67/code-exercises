package com.hackerrank.java.language.easy;

import java.util.Scanner;
import java.io.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {

        int limit = arr[0].length;
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int difference = 0;
/*
        if(limit < - 100 || limit > 100){
            return 0;
        }
        if(limit % 2 == 0){
            return 0;
        }
*/
        for(int i= 0; i < limit; i++){
            for(int j = 0; j < 1; j++){
                primaryDiagonal = primaryDiagonal + arr[i][i];
                secondaryDiagonal = secondaryDiagonal + arr[i][(limit-1)-i];
            }
        }
        difference = Math.abs(Math.abs(primaryDiagonal) - Math.abs(secondaryDiagonal));
        System.out.println("Diagonal Primaria = " + primaryDiagonal);
        System.out.println("Diagonal secundaria = " + secondaryDiagonal);
        System.out.println("Diferencia = " + difference);

        return difference;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        File inputFile = new File("C:\\Users\\Jorge\\Downloads\\input00.txt");

        //String[] arrInput = {"3","11 2 4","4 5 6","10 8  -12"};
        Scanner scanFile = new Scanner(inputFile);

        int n = scanFile.nextInt();
        scanFile.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanFile.nextLine().split(" ");
            scanFile.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        /*
        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        */

        int result = diagonalDifference(arr);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        //scanner.close();
    }
}
