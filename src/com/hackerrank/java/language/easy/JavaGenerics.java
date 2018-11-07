package com.hackerrank.java.language.easy;

import java.lang.reflect.Method;

public class JavaGenerics {
    public static void main(String[] args) {
        JavaGenericsPrint myPrinter = new JavaGenericsPrint();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1) System.out.println("Method overloading is not allowed!");

    }
}

