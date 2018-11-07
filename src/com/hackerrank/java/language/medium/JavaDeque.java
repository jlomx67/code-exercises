package com.hackerrank.java.language.medium;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class JavaDeque {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> valuesMap = new HashMap<>();

        int arraySize = in.nextInt();
        int subArraySize = in.nextInt();
        int uniqueIntegers = 0;

        for (int i = 0; i < arraySize; i++) {
            if(i >= subArraySize){
                int lastElement = deque.removeFirst();
                if(valuesMap.get(lastElement) == 1){
                    valuesMap.remove(lastElement);
                } else {
                    valuesMap.merge(lastElement, -1, Integer::sum);
                }
            }
            int num = in.nextInt();
            deque.addLast(num);
            valuesMap.merge(num, 1, Integer::sum);
            uniqueIntegers = Math.max(uniqueIntegers, valuesMap.size());
            if(uniqueIntegers == subArraySize){
                break;
            }
        }
        in.close();
        System.out.println(uniqueIntegers);
    }
}
