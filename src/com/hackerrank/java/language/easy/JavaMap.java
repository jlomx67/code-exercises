package com.hackerrank.java.language.easy;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

    private static  Scanner capture = new Scanner(System.in);

    private static HashMap createPhoneBook(int entries){
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i< entries; i++){
            phoneBook.put(capture.nextLine(), capture.nextInt());
            capture.nextLine();
        }
        return phoneBook;
    }

    private static void searchPerson(HashMap<String, Integer> phoneBook, String userName){
        try{
            int userPhone = phoneBook.get(userName);
            System.out.println(userName + "=" + userPhone);
        } catch(Exception e){
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();

        int entries = capture.nextInt();
        capture.nextLine();
        phoneBook = createPhoneBook(entries);

        while (capture.hasNext()) {
            searchPerson(phoneBook, capture.nextLine());
        }
    }
}
