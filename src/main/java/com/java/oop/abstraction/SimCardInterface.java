package com.java.oop.abstraction;

/**
 * <p>Hypothetically, this interface provides standards to communicate and tune
 * into a common frequency for information exchange</p>
 */
// COMPLETE ABSTRACTION
public interface SimCardInterface {

    public void switchNetwork(int frequency);

    public void registerNetwork();

    public void transmitInfo(String info);

    public void receiveInfo(String info);
}
