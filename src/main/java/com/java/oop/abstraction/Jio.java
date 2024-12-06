package com.java.oop.abstraction;

public class Jio implements SimCardInterface{

    @Override
    public void switchNetwork(int frequency) {
        // ... logic
        System.out.println("Switched to frequency "+frequency);
    }

    @Override
    public void registerNetwork() {
        System.out.println("Registered Network!");
    }

    @Override
    public void transmitInfo(String info) {
        System.out.println("Transmitting : "+info);
    }

    @Override
    public void receiveInfo(String info) {
        System.out.println("Received info : "+info);
    }
}
