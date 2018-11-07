package com.hackerrank.java.language.easy;

import java.util.*;

public class JavaTryCatch {
    public static void main(String[] args) {
        try(Scanner capture = new Scanner(System.in)){
            int a = capture.nextInt();
            int b = capture.nextInt();
            System.out.println(a/b);
        } catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }catch(ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        }
    }
}
