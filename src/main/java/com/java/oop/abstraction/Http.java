package com.java.oop.abstraction;

/**
 * Baseline standard for Internet Communication
 */
public interface Http {

    public String getIpAddres();

    public void sendHttpRequest(String request);

    public String readResponseBody();

    public int publishStatusCode();
}
