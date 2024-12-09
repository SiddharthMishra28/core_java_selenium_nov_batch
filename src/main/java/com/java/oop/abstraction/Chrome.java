package com.java.oop.abstraction;

public class Chrome implements Http {

    public int version;
    public int releaseCode;

    @Override
    public String getIpAddres() {
        // fake logic
        return "192.234.112.32";
    }

    @Override
    public void sendHttpRequest(String request) {
        //
    }

    @Override
    public String readResponseBody() {
        return "{'success' : 'true'}";
    }

    @Override
    public int publishStatusCode() {
        return 200;
    }
}
