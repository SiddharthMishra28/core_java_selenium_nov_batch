package com.java.oop.composition;

public class Wheel {
    private String wheelMake;
    private boolean isTubeless;

    public String getWheelMake() {
        return this.wheelMake;
    }

    public void setWheelMake(String wheelMake) {
        this.wheelMake = wheelMake;
    }

    public boolean getiIsTubeless() {
        return this.isTubeless;
    }

    public void setIsTubeless(boolean isTubeless) {
        this.isTubeless = isTubeless;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelMake='" + wheelMake + '\'' +
                ", isTubeless=" + isTubeless +
                '}';
    }
}
