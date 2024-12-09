package com.java.oop;

public class Banking {

    long accountNumber;
    String firstName;
    String lastName;
    String email;
    String phone;
    int accBal;

    public int withdraw(int amount) {
        return (accBal-amount);
    }

    public String getUserData() {
        return this.firstName+ " : "+this.lastName+" : "+this.email+" : "+this.phone;
    }

    public static void main(String[] args) {
        Banking iciciBank = new Banking();
        iciciBank.firstName = "sid";
        iciciBank.lastName = "mishra";
        iciciBank.email = "sid@test.com";
        iciciBank.phone = "302183021";
        iciciBank.accBal = 10000;
        int remainingBal = iciciBank.withdraw(500);
        String userData = iciciBank.getUserData();
        System.out.println(remainingBal);
        System.out.println(userData);
    }
}
