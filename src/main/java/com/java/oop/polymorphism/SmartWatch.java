package com.java.oop.polymorphism;

public class SmartWatch extends DevicePlatform {
    String[] gyro = new String[1];

    public void measureWalk(int distance) {
        gyro[0] = String.valueOf(distance);
    }
    public void summarizeWorkout() {
        System.out.println("You have walked "+this.gyro[0]+" kms today!");
    }


    public static void main(String[] args) {
        SmartWatch appleWatch = new SmartWatch();
//        appleWatch.os = "iWatchOS";
        appleWatch.model = "Watch 7";
        appleWatch.brand = "Apple";
        appleWatch.ioModel = "Touchscreen";
        appleWatch.instructions = new String[]{"iWatchOS", "mkir bla bla, cd..."};
        appleWatch.boot();
        appleWatch.measureWalk(3);
        appleWatch.summarizeWorkout();
    }
}
