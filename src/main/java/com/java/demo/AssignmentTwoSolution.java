package com.java.demo;

import java.util.Scanner;

public class AssignmentTwoSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean isRunning = true;
        System.out.println("###### Welcome to ATM kiosk #######");
        while(isRunning) {
            int innerOption;
            System.out.println("Choose an option from below menu:");
            System.out.println("1. savings account");
            System.out.println("2. mini statement");
            System.out.println("3. change pin");
            System.out.println("4. Quit Program");
            option = sc.nextInt();
            switch(option) {
                case 1:
                    System.out.println("1. withdraw money");
                    System.out.println("2. balance inquiry");
                    innerOption = sc.nextInt();
                    if(innerOption == 1) {
                        ///
                    }else if(innerOption == 2) {
                        //
                    }else {
                        // INVALID OPTION CHOSEN!
                    }
                    break;
                case 3:
                    String newPin;
                    System.out.println("Enter New Pin");
                    newPin = sc.nextLine();
                    if(newPin.length() == 4) {
                        System.out.println("Pin Changed");
                    }else {
                        System.out.println("Invalid Pin. Should be min 4 characters.");
                    }
                case 4:
                    System.out.printf("Bye!!");
                    isRunning = false;
                    break;
            }
        }
    }
}
