package com.java.oop.abstraction;

public class Firefox implements Http{

    public int version;

    @Override
    public String getIpAddres() {
        // fake logic different than chrome
        return "192.234.115.34";
    }

    @Override
    public void sendHttpRequest(String request) {
        //
        System.out.println("Placed request...");
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
