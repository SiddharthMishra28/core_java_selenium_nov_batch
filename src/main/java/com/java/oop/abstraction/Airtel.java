package com.java.oop.abstraction;

public class Airtel implements SimCardInterface {

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

    public static void main(String[] args) {
        SimCardInterface airtelSim = new Airtel();
        airtelSim.switchNetwork(5000);
        airtelSim.registerNetwork();
        airtelSim.transmitInfo("#\\xCDFSF");
        airtelSim.receiveInfo("sdsad");
    }
}
