package com.java.oop;

// EXTENDS KEYWORD IS USED TO ESTABLISH IS-A RELATIOSHIP OF PARENT CHILD TYPE
public class Car extends Vehicle {
    String climateControl;
    int seatCapacity;
    String stereo;

    public void setTemperature(int temp) {
        if(this.isStarted) {
            System.out.println("Temp Set to "+temp);
        }else {
            System.out.println("Start the car first please");
        }
    }

    public void playMusic(String track) {
        System.out.println("Stereo is playing "+track);
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.model = "i8";
        bmw.make = "BMW";
        bmw.seatCapacity = 5;
        bmw.startVehicle();
        bmw.setTemperature(18);
        bmw.playMusic("90s classic");
        bmw.stopVehicle();
    }
}
