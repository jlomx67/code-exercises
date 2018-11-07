package com.hackerrank.java.language.easy;

import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;

public class ArraySum {

    public static void main(String[] args) {

/*        int[][] arr = new int[][]{
                {3},
                {11,2,4},
                {4,5,6},
                {10,8, -12}
        };
        //System.out.println("Elemento 0: " + arr[0][0]);

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int diagonalDifference = 0;

        if(arr[0][0] < -100 || arr[0][0] > 100){
            System.out.println("Error constraints exceeded");
        }
        if(arr[0][0]%2 == 0){
            System.out.println("Not a diagonal, even array");
        }

        for(int i= 1; i <= arr[0][0]; i++){
            for(int j = 0; j < 1; j++) {
                primaryDiagonal = primaryDiagonal + arr[i][i - 1];
                secondaryDiagonal = secondaryDiagonal + arr[i][arr[0][0]-i];
            }
        }
        diagonalDifference = Math.abs(Math.abs(primaryDiagonal) - Math.abs(secondaryDiagonal));

        System.out.println("Diagonal Primaria = " + primaryDiagonal);
        System.out.println("Diagonal secundaria = " + secondaryDiagonal);
        System.out.println("Diferencia = " + diagonalDifference);*/
/*        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};

        int totalApples = 0;
        int totalOranges = 0;*/

        // counting apples
/*        for (int apple : apples){
            if((a + apple) >= s && (a + apple <= t)){
                totalApples  += 1;
            }
        }
        for (int orange : oranges){
            if((b + orange) <= t && (b + orange) >= s){
                totalOranges += 1;
            }
        }
        System.out.println("oranges: " + totalOranges);
        System.out.println("apples: " + totalApples);*/
       /* int x1 = 0;
        int v1 = 2;
        int x2 = 5;
        int v2 = 3;
        String answer = "";

        float factor = (x1 - x2)/(v2 - v1);
        if(((x1 - x2)%(v2 - v1)) == 0){
            if(((factor * v1) + x1) == ((factor * v2) + x2)){
                answer = "YES";
            } else {
                answer = "NO";
            }
        } else {
            answer = "NO";
        }

        if((x1 < x2) && (v1 < v2)){
            answer = "NO";
        } else {
            if(((x1 - x2)%(v2 - v1)) == 0){
                if(((factor * v1) + x1) == ((factor * v2) + x2)){
                    answer = "YES";
                } else {
                    answer = "NO";
                }
            } else {
        }
        System.out.println(answer);




            long startingPoint = x1 - x2;
            long velocity = v2 - v1;
            float factor = (x1 - x2)/(v2 - v1);

            String answer = "YES";
            if((x1 < x2) && (v1 < v2)){
                answer = "NO";
            } else {
                if(((x1 - x2)%(v2 - v1)) == 0){
                    if(((factor * v1) + x1) == ((factor * v2) + x2)){
                        answer = "YES";
                    } else {
                        answer = "NO";
                    }
                }
                return answer;*/
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int[] maxValues = new int[16];
        int k = 0;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int topVal = 0;
                int medVal = 0;
                int botVal = 0;
                for (int m = 0; m <= 2; m++) {
                    topVal += arr[i][j+m];
                    if(m == 1) {
                        medVal += arr[i + 1][j + m];
                    }
                    botVal += arr[i + 2][j+m];
                }
                maxValues[k] = (topVal + medVal + botVal);
                System.out.println("Hour glass " + i + ", " + j + "= " + (topVal + medVal + botVal));
                k++;
            }
        }
        int maxValue = Arrays.stream(maxValues).max().getAsInt();
        //System.out.println(maxValues);
        System.out.println(maxValue);
    }
}
