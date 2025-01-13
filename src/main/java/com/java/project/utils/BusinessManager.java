package com.java.project.utils;

import com.java.project.entities.Business;
import com.java.project.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessManager {
    List<Business> businessList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void manageBusiness(CustomerManager customerManager) {
        boolean isRunning = true;
        while(isRunning) {
            showBusinessMenu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    createBusiness();
                    break;

                case 2:
                    readBusiness();
                    break;

                case 3:
                    updateBusiness();
                    break;

                case 4:
                    deleteBusiness();
                    break;

                case 5:
                    associateCustomer(customerManager);
                    break;

                case 6:
                    showBusinessDetails();
                    break;

                case 7:
                    isRunning = false;
                    break;
            }
        }
    }

    public void showBusinessMenu() {
        System.out.println("Choose an option from below menu : ");
        System.out.println("1. Create a Business");
        System.out.println("2. Get Business Details");
        System.out.println("3. Update Business Details");
        System.out.println("4. Delete a Business");
        System.out.println("5. Associate a Business with a Customer");
        System.out.println("6. Show Business Details");
        System.out.println("7. Go back to Main Menu");
    }

    public void createBusiness() {
        Business business = new Business();
        System.out.println("Enter Business id : ");
        int id = sc.nextInt();
        sc.nextLine();
        business.setBusinesId(id);
        System.out.println("Enter Business name : ");
        String name = sc.nextLine();
        business.setBusinessName(name);
        System.out.println("Enter Business Description");
        String description = sc.nextLine();
        business.setBusinessDescription(description);
        businessList.add(business);
        System.out.println("Business Created Successfully!");
    }

    public void readBusiness() {
        System.out.println("Enter Business Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Business business = findBusinessById(id);
        if(business != null){
            System.out.println("Business id : "+business.getBusinesId());
            System.out.println("Business Name : "+business.getBusinessName());
            System.out.println("Business Description : "+business.getBusinessDescription());
        }else {
            System.out.println("No Business with Id "+id+" found");
        }
    }

    public void updateBusiness() {
        System.out.println("Enter Business Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Business business = findBusinessById(id);
        if(business != null) {
            System.out.println("Enter new business id : ");
            int businessId = sc.nextInt();
            sc.nextLine();
            business.setBusinesId(businessId);
            System.out.println("Enter new business name : ");
            String businessName = sc.nextLine();
            business.setBusinessName(businessName);
            System.out.println("Enter business description : ");
            String description = sc.nextLine();
            business.setBusinessDescription(description);
            System.out.println("Business Details updated successfully!");
        }else {
            System.out.println("No Business with Id "+id+" found");
        }
    }

    public void deleteBusiness() {
        System.out.println("Enter Business Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        Business business = findBusinessById(id);
        if(business != null) {
            businessList.remove(business);
            System.out.println("Business Deleted Successfully!");
        }else {
            System.out.println("No Business with Id "+id+" found");
        }
    }

    public Business findBusinessById(int id) {
        for(Business business : businessList) {
            if(business.getBusinesId() == id) {
                return business;
            }
        }
        return null;
    }

    public void associateCustomer(CustomerManager customerManager){
        System.out.println("Enter Business ID to associate with a customer");
        int id = sc.nextInt();
        sc.nextLine();
        Business business = findBusinessById(id);
        if(business != null){
            System.out.println("Enter the customer id to associate with this business");
            int customerId = sc.nextInt();
            sc.nextLine();
            Customer customer = customerManager.findCustomerById(customerId);
            if(customer != null) {
                business.addCustomer(customer);
                System.out.println("Customer added successfully!");
            }else {
                System.out.println("Customer with id "+customerId+" doesn't exist");
            }
        }else {
            System.out.println("Business with id "+id+" doesn't exist");
        }
    }

    public void showBusinessDetails() {
        System.out.println("Enter Business ID to view details : ");
        int businessId = sc.nextInt();
        sc.nextLine();
        Business business = findBusinessById(businessId);
            if(business != null){
                System.out.println("Business id : "+business.getBusinesId());
                System.out.println("Business name : "+business.getBusinessName());
                System.out.println("Business Description : "+business.getBusinessDescription());
                System.out.println("Customers associated with business "+business.getBusinessName()+" : ");
                for(Customer customer : business.getCustomers()) {
                    System.out.println("Customer id "+customer.getCustomerId());
                    System.out.println("Customer name : "+customer.getCustomerName());
                    System.out.println("Customer email : "+customer.getCustomerEmail());
                    System.out.println("Customer phone number : "+customer.getCustomerPhone());
                }
            }else {
                System.out.println("Business with id "+businessId+" doesn't exist");
            }
        }
}
