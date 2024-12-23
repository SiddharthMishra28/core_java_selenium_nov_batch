package com.java.oop.composition;

public class Chassis {
    private String chassisType;
    private int chassisNum;

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public int getChassisNum() {
        return chassisNum;
    }

    public void setChassisNum(int chassisNum) {
        this.chassisNum = chassisNum;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "chassisType='" + chassisType + '\'' +
                ", chassisNum=" + chassisNum +
                '}';
    }
}
