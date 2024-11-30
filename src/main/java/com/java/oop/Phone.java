package com.java.oop;

public class Phone {
    String make;
    String os;
    String model;
    int ramCapacity;
    float screenSize;
    String simCardCarrier;

    //this keyword refers to class member variables
    public void startPhone() {
        if(this.os.equalsIgnoreCase("Android")) {
            System.out.println("Welcome to Android");
        }else if(this.os.equalsIgnoreCase("IOS")) {
            System.out.println("Welcome to Apple Ecosystem...");
        }
        else {
            System.out.println("Phone "+this.make+" Powering on...");
        }
    }

    public void dialNumber(String number) {
        if(this.os.equalsIgnoreCase("IOS")) {
            System.out.println("Dialing via facetime...");
        }else {
            System.out.println("Calling "+number+" via network...");
        }
    }

    public static void main(String[] args) {
        Phone samsungGalaxy = new Phone();
        samsungGalaxy.os = "Android";
        samsungGalaxy.make = "Samsung";
        samsungGalaxy.model = "Galaxy";
        samsungGalaxy.ramCapacity = 8;
        samsungGalaxy.screenSize = 6.5f;
        samsungGalaxy.simCardCarrier = "Airtel";
        samsungGalaxy.startPhone();
        samsungGalaxy.dialNumber("83746372737");

        Phone appleIphone = new Phone();
        appleIphone.make = "Apple";
        appleIphone.model = "Iphone 16";
        appleIphone.ramCapacity = 6;
        appleIphone.os = "IOS";
        appleIphone.startPhone();
    }

}
