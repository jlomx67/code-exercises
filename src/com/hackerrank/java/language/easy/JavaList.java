package com.hackerrank.java.language.easy;

import java.util.LinkedList;
import java.util.Scanner;

public class JavaList {

    private static Scanner scanner = new Scanner(System.in);

    private static LinkedList buildList(int listSize){
        LinkedList<Integer> thisList = new LinkedList<>();
        for (int i = 0; i < listSize; i++){
            thisList.add(scanner.nextInt());
        }
        return thisList;
    }

    public static void main(String[] args) {

        LinkedList<Integer> elements = new LinkedList<>();
        int elementsInList = scanner.nextInt();

        elements = buildList(elementsInList);

        int queries = scanner.nextInt();
        for(int i = 0; i < queries; i++) {
            String operation = scanner.next();
            if(operation == "Insert"){
                int position = scanner.nextInt();
                int element = scanner.nextInt();
                elements.add(position, element);
            } else {
                int position = scanner.nextInt();
                elements.remove(position);
            }
        }
        elements.forEach(thisElement -> System.out.print(thisElement + " "));
    }
}