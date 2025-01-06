package com.java.project;

import com.java.project.entities.Business;
import com.java.project.utils.AddressManager;
import com.java.project.utils.BusinessManager;
import com.java.project.utils.CustomerManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        BusinessManager businessManager = new BusinessManager();
        CustomerManager customerManager = new CustomerManager();
        AddressManager addressManager = new AddressManager();
        System.out.println("############ WELCOME TO CRM APPLICATION ############");
        while(isRunning) {
            int option;
            showMainMenu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    businessManager.manageBusiness();
                    break;
                case 2:
                    // customermanager
                    break;
                case 3:
                    // addressmanager
                    break;
                case 4:
                    isRunning = false;
                    break;
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("Choose an option from below menu : ");
        System.out.println("1. Manage Business");
        System.out.println("2. Manage Customer");
        System.out.println("3. Manage Address");
        System.out.println("4. Quit Program");
    }
}
