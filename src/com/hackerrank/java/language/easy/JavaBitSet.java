package com.hackerrank.java.language.easy;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);

        int bitSetSize = capture.nextInt();
        int operations = capture.nextInt();

        BitSet bitSet1 = new BitSet(bitSetSize);
        BitSet bitSet2 = new BitSet(bitSetSize);

        for(int i = 0; i< operations; i++){

            String operation = capture.next();
            int firstSet = capture.nextInt();
            int secondSetOrIndex = capture.nextInt();

            switch(operation){
                case "AND":
                    if(firstSet == 1){
                        bitSet1.and(bitSet2);
                    } else {
                        bitSet2.and(bitSet1);
                    }
                    break;
                case "SET":
                    if(firstSet == 1){
                        bitSet1.set(secondSetOrIndex);
                    } else {
                        bitSet2.set(secondSetOrIndex);
                    }
                    break;
                case "FLIP":
                    if(firstSet == 1){
                        bitSet1.flip(secondSetOrIndex);
                    } else {
                        bitSet2.flip(secondSetOrIndex);
                    }
                    break;
                case "OR":
                    if(firstSet == 1){
                        bitSet1.or(bitSet2);
                    } else {
                        bitSet2.or(bitSet1);
                    }
                    break;
                case "XOR":
                    if(firstSet == 1){
                        bitSet1.xor(bitSet2);
                    } else {
                        bitSet2.xor(bitSet1);
                    }
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
    }
}
