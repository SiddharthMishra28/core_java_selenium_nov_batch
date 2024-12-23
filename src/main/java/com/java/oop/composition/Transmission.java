package com.java.oop.composition;

public class Transmission {
    private String transmissionType;
    private int numGears;

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transmissionType='" + transmissionType + '\'' +
                ", numGears=" + numGears +
                '}';
    }
}
