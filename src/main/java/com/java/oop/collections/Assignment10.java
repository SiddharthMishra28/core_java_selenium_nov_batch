package com.java.oop.collections;

import java.util.Scanner;

public class Assignment10 {
    // PRACTICE LIST AND SET INTERFACE EXAMPLES
    // CREATE A CLASS CALLED AS ShoppingCart
    // CREATE METHODS TO ADD AND REMOVE PRODUCTS
    // DECLARE ANOTHER CLASS CALLED AS FLIPKART
    // CREATE LIST OF SHOPPING CART
    // PROVIDE A DYNAMIC MENU TO ADD AND REMOVE ITEMS TO AND FROM CART
    // SHOW TOTAL AMOUNT FOR ITEMS IN YOUR CART

    public static void main(String[] args) {
        boolean isRunning = true;
        Flipkart flipkart = new Flipkart();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Flipkart");
        while(isRunning) {
            int option;
            System.out.println("Choose an option from below menu : ");
            System.out.println("1. Create an Account");
            System.out.println("2. Create a product");
            System.out.println("3. Add product to shopping cart");
            System.out.println("4. Remove product from shopping cart");
            System.out.println("5. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    Account account = new Account();
                    System.out.println("Enter account Id");
                    account.setAccountId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Account Holders name");
                    account.setAccountHoldersName(sc.nextLine());
                    // REST OF CODE
                    break;
            }
        }
    }
}
