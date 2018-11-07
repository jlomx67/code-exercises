package com.hackerrank.java.datastructures.medium;

import java.util.Arrays;

public class MergeThreeLists {

    public static void main(String[] args){

        int[] firstList = {1,2,3,4,6,7};
        int[] secondList = {4,5,6,7};
        int[] thirdList = {7,8,9};

        int[] mergedList = new int[firstList.length + secondList.length + thirdList.length];

        int x = 0;
        int y = 0;
        int z = 0;

        for(int i = 0; i < mergedList.length; i++){
            mergedList[i] = x < firstList.length && (y >= secondList.length
                    || firstList[x] < secondList[y])
                    ? (z >= thirdList.length || firstList[x] < thirdList[z]
                        ? firstList[x++] : thirdList[z++])
                    : (y < secondList.length &&
                        (z >= thirdList.length || secondList[y] < thirdList[z])
                    ? secondList[y++] : thirdList[z++]);
        }
        System.out.println(Arrays.toString(mergedList));
    }
}
