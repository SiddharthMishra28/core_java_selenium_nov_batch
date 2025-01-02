package com.java.oop.collections;

import java.util.List;

public class Flipkart {

    private List<Account> accountList;

    public Flipkart() {

    }

    public Flipkart(List<Account> accountList) {
        this.accountList = accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
