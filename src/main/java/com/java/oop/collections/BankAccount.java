package com.java.oop.collections;

public class BankAccount {
    private String username;
    private String password;
    private int accountBalance;
    private String accountNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount) {
        this.accountBalance+=amount;
        System.out.println("Amount : "+amount+" Deposited into Account "+this.accountNumber);
        System.out.println("Total Account Balance : "+this.accountBalance);
    }

    public void withdraw(int amount) {
        this.accountBalance-=amount;
        System.out.println("Amount : "+amount+" Withdrawn from Account "+this.accountNumber);
        System.out.println("Total Account Balance : "+this.accountBalance);
    }
}
