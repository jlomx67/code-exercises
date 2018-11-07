package com.hackerrank.java.algorithms.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BetweenTwoSets {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int result = 0;
        int firstInteger = 0;
        int secondInteger = 0;


        return result;
    }

    private static final Scanner capture = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = capture.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());
        int m = Integer.parseInt(nm[1].trim());
        int[] arrayA = new int[n];

        String[] aItems = capture.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            arrayA[aItr] = aItem;
        }

        int[] arrayB = new int[m];

        String[] bItems = capture.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            arrayB[bItr] = bItem;
        }

        int total = getTotalX(arrayA, arrayB);

//        bw.write(String.valueOf(total));
//        bw.newLine();

//        bw.close();
    }
}
