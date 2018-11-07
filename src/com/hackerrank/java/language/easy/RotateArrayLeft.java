package com.hackerrank.java.language.easy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RotateArrayLeft {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

/*        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);
        int[] a = new int[n];
*/
        int d = 4;
        int[] a = {1,2,3,4,5};



/*      String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
*/
        int[] result =new int[a.length];

        for(int i=0; i<=a.length-1; i++){
            // Se calcula un nuevo indice basado en la longitud del arreglo
            // y en el numero de rotaciones
            int newIndex = (i+d)%a.length;
            result[i] = a[newIndex];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] +  ",");
            /*bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }*/
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
