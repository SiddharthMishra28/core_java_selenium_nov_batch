package com.java.oop.Inherticance;

public class Vehicle {
    String make;
    String model;
    String type;
    int engineCapacity;
    boolean isStarted;

    public void startVehicle() {
        this.isStarted = true;
        System.out.println("Vehicle "+this.model+" Started....");
    }

    public void stopVehicle() {
        this.isStarted = false;
        System.out.println("Vehicle "+this.model+" Stopped...");
    }
}
