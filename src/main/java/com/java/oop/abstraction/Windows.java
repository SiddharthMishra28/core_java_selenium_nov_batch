package com.java.oop.abstraction;

public class Windows {
    Http browser = new Firefox();

    public void readWindowsUpdate() {
        browser.getIpAddres();
        browser.sendHttpRequest("http://www.wikipedia.com");
        browser.readResponseBody();
    }

    public void initiateBrowserService() {
        browser.publishStatusCode();
    }
}
