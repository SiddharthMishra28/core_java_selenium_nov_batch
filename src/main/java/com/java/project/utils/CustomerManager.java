package com.java.project.utils;

import com.java.project.entities.Business;
import com.java.project.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {

    List<Customer> customerList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void manageCustomer() {
        boolean isRunning = true;
        while(isRunning) {
            showCustomerMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    createCustomer();
                    break;

                case 2:
                    readCustomer();
                    break;

                case 3:
                    updateCustomer();
                    break;

                case 4:
                    deleteCustomer();
                    break;

                case 5:
                    isRunning = false;
                    break;
            }
        }
    }

    public void showCustomerMenu() {
        System.out.println("Choose an option from below menu : ");
        System.out.println("1. Create a Customer");
        System.out.println("2. Get Customer Details");
        System.out.println("3. Update Customer Details");
        System.out.println("4. Delete a Customer");
        System.out.println("5. Go back to Main Menu");
    }

    public void createCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter Customer id : ");
        int id = sc.nextInt();
        sc.nextLine();
        customer.setCustomerId(id);
        System.out.println("Enter Customer name : ");
        String name = sc.nextLine();
        customer.setCustomerName(name);
        System.out.println("Enter Customer Email");
        String email = sc.nextLine();
        customer.setCustomerEmail(email);
        System.out.println("Enter Customer Phone Number");
        String phone = sc.nextLine();
        customer.setCustomerPhone(phone);
        customerList.add(customer);
        System.out.println("Customer Created Successfully!");
    }

    public void readCustomer() {
        System.out.println("Enter Customer Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Customer customer = findCustomerById(id);
        if(customer != null){
            System.out.println("Customer id : "+customer.getCustomerId());
            System.out.println("Customer Name : "+customer.getCustomerName());
            System.out.println("Customer Email : "+customer.getCustomerEmail());
            System.out.println("Customer Phone : "+customer.getCustomerPhone());
        }else {
            System.out.println("No Customer with Id "+id+" found");
        }
    }

    public void updateCustomer() {
        System.out.println("Enter Business Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Customer customer = findCustomerById(id);
        if(customer != null) {
            System.out.println("Enter new customer id : ");
            int customerId = sc.nextInt();
            sc.nextLine();
            customer.setCustomerId(customerId);
            System.out.println("Enter new customer name : ");
            String customerName = sc.nextLine();
            customer.setCustomerName(customerName);
            System.out.println("Enter cutomer email : ");
            String email = sc.nextLine();
            customer.setCustomerEmail(email);
            System.out.println("Enter cutomer phone : ");
            String phone = sc.nextLine();
            customer.setCustomerPhone(phone);
            System.out.println("Customer Details updated successfully!");
        }else {
            System.out.println("No Business with Id "+id+" found");
        }
    }

    public void deleteCustomer() {
        System.out.println("Enter Customer Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Customer customer = findCustomerById(id);
        if(customer != null) {
            customerList.remove(customer);
            System.out.println("Customer Deleted Successfully!");
        }else {
            System.out.println("No Customer with Id "+id+" found");
        }
    }

    public Customer findCustomerById(int id) {
        for(Customer customer : customerList) {
            if(customer.getCustomerId() == id) {
                return customer;
            }
        }
        return null;
    }
}
