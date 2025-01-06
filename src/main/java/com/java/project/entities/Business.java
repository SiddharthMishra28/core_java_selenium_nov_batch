package com.java.project.entities;

import java.util.List;

public class Business {
    private int businesId;
    private String businessName;
    private String businessDescription;
    private List<Customer> customers;

    public Business() {
    }

    public Business(int businesId, String businessName, String businessDescription, List<Customer> customers) {
        this.businesId = businesId;
        this.businessName = businessName;
        this.businessDescription = businessDescription;
        this.customers = customers;
    }

    public int getBusinesId() {
        return businesId;
    }

    public void setBusinesId(int businesId) {
        this.businesId = businesId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    public void setBusinessDescription(String businessDescription) {
        this.businessDescription = businessDescription;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businesId=" + businesId +
                ", businessName='" + businessName + '\'' +
                ", businessDescription='" + businessDescription + '\'' +
                ", customers=" + customers +
                '}';
    }
}
