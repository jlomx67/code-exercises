package com.hackerrank.java.language.medium;

import java.util.Arrays;
import java.util.Scanner;

public class JavaComparator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        JavaComparatorPlayer[] player = new JavaComparatorPlayer[n];
        JavaComparatorChecker checker = new JavaComparatorChecker();

        for (
                int i = 0;
                i < n; i++)

        {
            player[i] = new JavaComparatorPlayer(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (
                int i = 0;
                i < player.length; i++)

        {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
