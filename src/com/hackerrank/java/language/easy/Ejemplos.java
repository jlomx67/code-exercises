package com.hackerrank.java.language.easy;

import java.util.*;

public class Ejemplos {

    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String s = scanner.next();
    String[] m = scanner.next().split(" ");
    int[] numbers = new int[scanner.nextInt()];

    /*    static int B;
        static int H;
        static boolean flag = true;

        static {
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            try {
                if (B < 0 || H < 0) {
                    flag = false;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }*/
    public static void main(String[] arg) {

/*
        int d = 4;
        int[] a = {1,2,3,4,5};
        int[] newArray = new int[a.length];
        for(int i =1; i<=d; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j == 0) {
                    newArray[a.length - 1] = a[j];
                } else {
                    newArray[j-1] = a[j];
                }
            }
            System.arraycopy(newArray, 0, a, 0, newArray.length);
        }
        while(d > 0){
            for(int i=0; i< a.length-1; i++) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
            d--;
        }
*/
/*        while(rotation > 0){
            for(int i=0; i< a.length-1; i++) {
                int temp = a[a.length-1];
                a[a.length-1] = a[i];
                a[i] = temp;
            }
            rotation--;
        }




        System.out.print("Original array: ");
        for(int item:a) {
            System.out.print(item + "," );
        }
*/

/*        String A="hello";
        String B="java";

        String S = "Helloworld";
        int start = 3;
        int end = 7;
        String a = S.substring(start, (end));
        System.out.println(a);*/

        Scanner scanner = new Scanner(System.in);
        int totalLines = scanner.nextInt();

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < totalLines; i++) {
            int thisLine = scanner.nextInt();
            ArrayList<Integer> thisRow = new ArrayList<>();
            int counter = 0;
            for (int j = 0; j < thisLine; j++) {
                thisRow.add(scanner.nextInt());
            }
            rows.add(thisRow);
        }

        int queryNumber = scanner.nextInt();

        for(int i = 0; i < queryNumber; i++){
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            try{
                System.out.println(rows.get(row - 1).get(column - 1));
            } catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }
}
