package com.hackerrank.java.language.easy;

public class JavaGenericsPrint {
    public <E> void printArray(E[] thisArray){
        for(E element : thisArray){
            System.out.println(element);
        }
    }
}
