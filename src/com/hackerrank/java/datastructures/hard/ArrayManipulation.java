package com.hackerrank.java.datastructures.hard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayManipulation {


    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        int[] zeroArray = new int[n];
        long[] differenceArray = new long[n];
        long maxValue = Long.MIN_VALUE;
        long currValue = 0;

        for(int i = 0; i < queries.length; i++){

            int leftIndex = queries[i][0] - 1;
            int rigthIndex = queries[i][1] - 1;
            int addValue = queries[i][2];

            differenceArray[leftIndex] += addValue;

            if(rigthIndex + 1 < n){
                differenceArray[rigthIndex + 1] -=  addValue;
            }
        }

        for(int i = 1; i < differenceArray.length; i++){
            differenceArray[i] += differenceArray[i - 1];
            maxValue = Math.max(differenceArray[i], maxValue);
        }
        //long result =  Collections.max(Arrays.stream(zeroArray).boxed().collect(Collectors.toList()));

        return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] queries = new int[m][3];

        int[] zeroArray = new int[n];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

/*        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
