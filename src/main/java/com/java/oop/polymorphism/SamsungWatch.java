package com.java.oop.polymorphism;

// POLYMORPHIC BEHAVIOR
public class SamsungWatch extends DevicePlatform {

    String[] gyro = new String[1];
    String[] pictures = new String[3];

    public void measureWalk(int distance) {
        gyro[0] = String.valueOf(distance);
    }
    public void summarizeWorkout() {
        System.out.println("You have walked "+this.gyro[0]+" kms today!");
    }

    public void boot() {
        System.out.println("Hello there! welcome to samsung!");
    }

    // MORPHING TO HAVE DIFFERENT FUNCTIONALITY
    // METHOD OVERLOADED WITH 1 ARGUMENT
    public void boot(String[] pictures) {
        this.pictures = pictures;
        for(int i=0; i<pictures.length; i++) {
            System.out.println("Changing Picture to "+this.pictures[i]);
        }
        System.out.println("Watch Booted!");
    }

    // METHOD OVERLOADING WITH 2 AGRUMENTS
    public void boot(String[] pictures, String customMessage) {
        this.pictures = pictures;
        for(int i=0; i<pictures.length; i++) {
            System.out.println("Changing Picture to "+this.pictures[i]);
        }
        System.out.println(customMessage);
    }

    public static void main(String[] args) {
        SamsungWatch series5 = new SamsungWatch();
        series5.instructions = new String[]{"Samsung Baidu OS", "mkir bla bla, cd..."};
        series5.boot();
    }

}
