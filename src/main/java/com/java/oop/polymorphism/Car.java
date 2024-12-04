package com.java.oop.polymorphism;

public class Car extends Vehicle {

    int numWheels;
    int seatCapacity;

    //OVERRIDING METHOD IN VEHICLE CLASS
    public void moveVehicle(int speed) {
        System.out.println("Vehicle Moving @"+speed+" km/hr");
    }

    // CUSTOMIZING DEFAULT BEHAVIOR
    // OVERLOADED THE MOVEVEHICLE METHOD
    public void moveVehicle(int speed, boolean isManualMode) {
        if(isManualMode) {
            System.out.println("Car Running in Manual Mode in speed "+speed+" km/hr");
        }else {
            if(speed > 0 && speed < 30) {
                this.numGear = 1;
            }else if(speed>31 && speed < 60) {
                this.numGear = 2;
            }
            System.out.println("Vehicle Movine @"+speed+" km/hr in with gear "+this.numGear);
        }
    }

    public static void main(String[] args) {
        Car safari = new Car();
        safari.make = "tata";
        safari.model = "Safari";
        safari.numWheels = 4;
        safari.engineCapacity = 2200;
        safari.seatCapacity = 7;
        safari.startVehicle();
        safari.moveVehicle(45);
    }
}
