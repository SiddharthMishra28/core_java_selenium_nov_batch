package com.java.oop.encapsulation;

public class Banking {
    private long accountNumber;
    private String name;
    private int accBal;
    String type;

    // GETTERS AND SETTERS
    public void setAccountNumber(long accNum) {
        this.accountNumber = accNum;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }
}
