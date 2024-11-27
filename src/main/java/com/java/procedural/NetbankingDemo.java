package com.java.procedural;

import java.util.Scanner;

public class NetbankingDemo {
    public static void main(String[] args) {
        // design menu - bunch of prints
        // accept userinput - scanner
        // storage - accountBalance, optionSelected, processedValue
        // logic
        System.out.println("############# WELCOME TO NETBANKING FOR XYZ BANK #############");
        int accountBalance = 10000;
        int option;
        boolean isRunning = true;
        String IPIN = "0000";
        Scanner sc = new Scanner(System.in);
        while(isRunning) {
            int tempAmount;
            System.out.println("Please select an option from below menu");
            System.out.println("1. Balance Inquiry");
            System.out.println("2. Change IPIN");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Quit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your Account Balance is : "+accountBalance);
                    break;

                case 2:
                    System.out.println("Enter 4 digit new IPIN");
                    sc.nextLine();
                    IPIN = sc.nextLine();
                    if(IPIN.length() != 4) {
                        System.out.println("Invalid IPIN Entered. Should be 4 digits");
                    }
                    break;

                case 3:
                    System.out.println("Enter Amount to Withdraw.");
                    tempAmount = sc.nextInt();
                    if(tempAmount <= accountBalance) {
                        accountBalance-=tempAmount;
                    }else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Amount to Deposit.");
                    sc.nextLine();
                    String depositAmount = sc.nextLine();
                    tempAmount = Integer.parseInt(depositAmount); // ANOTHER WAY TO CONVERT STRING TO INTEGER
                    accountBalance+=tempAmount;
                    System.out.println("Deposit Successful!");
                    break;

                case 5:
                    System.out.println("Bye..");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid Menu Option Selected!");
                    break;
            }
        }
    }
}
