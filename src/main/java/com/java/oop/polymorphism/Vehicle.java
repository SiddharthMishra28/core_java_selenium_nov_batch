package com.java.oop.polymorphism;

public class Vehicle {

    String make;
    String model;
    int engineCapacity;
    int numGear;

    public void startVehicle() {
        System.out.println("Vehicle Started..");
    }

    public void stopVehicle() {
        System.out.println("Vehicle Stopped..");
    }

    public void moveVehicle(int speed) {
        if(speed > 0 && speed < 30) {
            this.numGear = 1;
        }else if(speed>31 && speed < 60) {
            this.numGear = 2;
        }
        System.out.println("Vehicle Movine @"+speed+" km/hr in with gear "+this.numGear);
    }
}
