package com.hackerrank.java.language.medium;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaShaEncryption {

    private static String encryptText(String thisText, String thisEncoder) throws Exception {
        StringBuilder encryptedText = new StringBuilder();
        MessageDigest text5Encoder = MessageDigest.getInstance(thisEncoder);
        byte[] hashInBytes = text5Encoder.digest(thisText.getBytes(StandardCharsets.UTF_8));
        for (byte b : hashInBytes) {
            encryptedText.append(String.format("%02x", b));
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        String textToEncrypt = capture.nextLine();
        try {
            System.out.println(encryptText(textToEncrypt, "SHA-256"));
            System.out.println(encryptText(textToEncrypt, "MD5"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
