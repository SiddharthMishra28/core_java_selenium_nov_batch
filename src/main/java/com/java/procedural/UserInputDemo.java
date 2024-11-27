package com.java.procedural;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in); // Take input from user , console
        String input = sc.nextLine();
//        int values = Integer.parseInt(input.substring(22,25));
//        float values = Float.parseFloat();
        System.out.println("Number of characters are : "+input.length());
    }
}
