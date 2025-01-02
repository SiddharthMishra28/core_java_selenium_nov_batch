package com.java.oop.collections;

public class Account {
    private int accountId;
    private String accountHoldersName;
    private ShoppingCart shoppingCart;

    public Account() {

    }

    public Account(int accountId, String accountHoldersName, ShoppingCart shoppingCart) {
        this.accountId = accountId;
        this.accountHoldersName = accountHoldersName;
        this.shoppingCart = shoppingCart;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
