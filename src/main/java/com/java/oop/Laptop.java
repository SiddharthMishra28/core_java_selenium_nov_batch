package com.java.oop;

public class Laptop {
    private String make;
    private String model;
    private int ramCapacity;
    private String os;

    public Laptop(String mk, String mod, int ramC, String os) {
        this.make = mk;
        this.model = mod;
        this.ramCapacity = ramC;
        this.os = os;
        this.turnOn();
    }

    public void turnOn() {
        System.out.println("Starting Laptop "+this.make+" : "+this.model);
    }
    public void turnOn(String message) {
        if(this.make.equalsIgnoreCase("APPLE")) {
            System.out.println("APPLE LOGO...");
        }else {
            System.out.println("Welcome to Windows : "+message);
        }
    }

    public static void main(String[] args) {
        Laptop macbook = new Laptop("Apple", "Macbook Air", 8, "Sierra");

        Laptop thinkPad = new Laptop("Lenovo", "Thinkpad", 16, "Windows 11");

        macbook.turnOn("Welcome to Laptop..");
        thinkPad.turnOn("Welcome to Thinkpad..");
    }
}
