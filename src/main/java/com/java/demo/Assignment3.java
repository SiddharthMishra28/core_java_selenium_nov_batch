package com.java.demo;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        // INVENTORY AND BILLING SYSTEM
        // 1. CREATE INVENTORY
        //     - HOW MANY PRODUCTS - n
        //     - ENTER PRODUCT name and price
        // 2. CREATE BILL
        //     - LOOP THROUGH ALL THE PRODUCTS AND CREATE A SUM OF ALL VALUES AND DISPLAY
        // 3. QUIT
        System.out.println("##### Inventory and Billing System");
        Scanner sc = new Scanner(System.in);
//        String[][] products = {
//                {"name", "price"},
//                {"phone", "5000"},
        //             0      1
//                {"laptop", "35000"},
//                {"earplugs", "1800"}
//        };
        boolean isRunning = true;
        int option;
        int productCount = 0;
        String[][] products = null;
        while(isRunning) {
            System.out.println("1. Create New Product");
            System.out.println("2. Create Bill");
            System.out.println("3. Quit Program");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("How many products do you wish to create?");
                    productCount = sc.nextInt();
                    sc.nextLine();
                    products = new String[productCount][2];
                    for(int i = 0; i<productCount; i++) {
                        System.out.println("Enter Product Name");
                        products[i][0] = sc.nextLine();
                        System.out.println("Enter Product Price");
                        products[i][1] = sc.nextLine();
                    }
                    System.out.println("Products created!");
                    break;
                case 2:
                    int totalBill = 0;
                    System.out.println("Creating Bill");
                    for(int i = 0; i<productCount; i++) {
                        totalBill+=Integer.parseInt(products[i][1]);
                    }
                    System.out.println("Total Bill is "+totalBill);
                    break;
                case 3:
                    System.out.println("Bye!");
                    isRunning = false;
            }
        }
    }
}
