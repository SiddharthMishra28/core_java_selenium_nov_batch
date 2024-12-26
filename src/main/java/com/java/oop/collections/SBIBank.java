package com.java.oop.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SBIBank {
    public static void main(String[] args) {
        System.out.println("########### WELCOME TO SBI BANK ###########");
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        List<BankAccount> bankAccountList = new ArrayList<>();
        // display menu
        // 1. create account
        // 2. deposit money to account
        // 3. withdraw money from account
        while(isRunning) {
            int option;
            System.out.println("Choose an option from below menu : ");
            System.out.println("1. Create an Account");
            System.out.println("2. Deposit Money to an Account");
            System.out.println("3. Withdraw Money from an Account");
            System.out.println("4. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    BankAccount bankAccount = new BankAccount();
                    System.out.println("Enter your name :");
                    bankAccount.setUsername(sc.nextLine());
                    break;
                case 2:
                    sc.nextLine();
                    int withDrawAmount;
                    System.out.println("Enter account Number : ");
                    String accountNumber = sc.nextLine();
                    for(int i=0; i< bankAccountList.size(); i++) {
                        if(bankAccountList.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)){
                            System.out.println("Enter amount to withdraw : ");
                            withDrawAmount = sc.nextInt();
                            bankAccountList.get(i).withdraw(withDrawAmount);
                        }else {
                            System.out.println("Invalid Account number");
                        }
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Bye...");
                    break;
            }
        }
    }
}
