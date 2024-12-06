package com.java.oop.abstraction;

public class WifiNetwork extends NetworkInterface {
    @Override
    public void configureNetwork() {
        // Wifi Network Logic
        System.out.println("Network Configured for Wifi!");
    }

    public static void main(String[] args) {
        WifiNetwork network = new WifiNetwork();
        network.configureNetwork();
    }
}
