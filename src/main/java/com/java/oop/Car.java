package com.java.oop;

public class Car {
    String make;
    String model;
    Engine fiatEngine; // HAS-A
    Transmission amtTransmission; // HAS-A

    public static void main(String[] args) {
        Car santro = new Car();
        santro.make = "Hyundai";
        santro.model = "xing";
        santro.fiatEngine.engineMake = "Fiat";
        santro.fiatEngine.engineModel = "RollerStorme";
        santro.fiatEngine.capacityInCc = 1100;
        santro.fiatEngine.numCylinders = 4;
//        santro.amtTransmission.type = "AMT";
//        santro.amtTransmission.numGears = 5;
//        santro.amtTransmission.maxTorque = 175;
        Transmission mahindraTransmission = new Transmission();
        mahindraTransmission.type = "AMT";
        mahindraTransmission.numGears = 5;
        mahindraTransmission.maxTorque = 175;
        santro.amtTransmission = mahindraTransmission;
    }
}
