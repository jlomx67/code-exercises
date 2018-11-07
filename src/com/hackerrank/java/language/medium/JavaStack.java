package com.hackerrank.java.language.medium;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    private static boolean isBalanced(String thisLine){

        HashMap<Character, Character> stackValues = getMapValues();
        char[] linekArray;
        Stack thisStack = new Stack();

        try{
            linekArray = thisLine.trim().toCharArray();
            if((linekArray.length % 2) != 0){
                return false;
            }

            for(int i = 0; i < linekArray.length; i++){
                if(stackValues.containsKey(linekArray[i])){
                    thisStack.push(linekArray[i]);
                } else if(thisStack.isEmpty() || linekArray[i] != stackValues.get(thisStack.pop())){
                    return false;
                }
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    private static HashMap getMapValues(){
        HashMap<Character, Character> mapValues = new HashMap<>();

        mapValues.put('(', ')');
        mapValues.put('{', '}');
        mapValues.put('[', ']');

        return mapValues;
    }

    public static void main(String[] args){

//        System.out.println(isBalanced("{}()"));

        Scanner capture = new Scanner(System.in);

        while(capture.hasNext()){
            System.out.println(isBalanced(capture.next()));
        }

    }
}
