package com.java.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        List<Business> businessList = new ArrayList<>();
        System.out.println("############ WELCOME TO CRM APPLICATION ############");
        while(isRunning) {
            int option;
            showMainMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    sc.nextLine();
                    Business business = new Business();
                    System.out.println("Enter business id : ");
                    business.setBusinesId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter business name : ");
                    business.setBusinessName(sc.nextLine());
                    System.out.println("Enter business description");
                    business.setBusinessDescription(sc.nextLine());
                    businessList.add(business);
                    System.out.println("New Business Creation successful!");
                    System.out.println(business);
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Bye..");
                    break;

            }
        }
    }

    public static void showMainMenu() {
        System.out.println("Choose an option from below menu : ");
        System.out.println("1. Create a business");
        System.out.println("2. Edit a businesss");
        System.out.println("3. Read business details");
        System.out.println("4. Delete a business");
        System.out.println("5. Quit Program");
    }
}
