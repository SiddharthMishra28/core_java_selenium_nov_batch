package com.java.procedural;

public class CipherProject {
    public static void main(String[] args) {
        String message = "This is a secret message";
        char[] characters = message.toCharArray();
        char[] encrypted = new char[characters.length];
        int shift = 4;
        for(int i=0; i<characters.length; i++) {
            int temp = (int)characters[i];
//            System.out.println(temp+shift);
            encrypted[i] = (char)(temp+shift);
        }
        String data = new String(encrypted);
        System.out.println(data);
        // CREATE A MENU FOR THE USER
        // 1. Encrypt text
        //    - 1. Enter text to encrypt
        //         Enter shift
        //         SHOW ENCRYPTED TEXT USING LOGIC ABOVE
        // 2. Decrypt text
        //         SAME AS ENCRYPTED, USE NEGATIVE SHIFT
        // 3. Quit
    }
}
