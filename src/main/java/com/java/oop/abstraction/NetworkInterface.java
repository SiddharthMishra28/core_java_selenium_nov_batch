package com.java.oop.abstraction;

// PARTIAL ABSTRACTION
public abstract class NetworkInterface {
    int port;
    String ipAddress;
    String domain;
    String[] vpnConfig;

    // CONCRETE / NON-ABSTRACT METHODS
    public String applyNetworkInterface() {
        //...
        return "Applied Provided Network Interface";
    }

    // ABSTRACT METHODS
    public abstract void configureNetwork();

}
