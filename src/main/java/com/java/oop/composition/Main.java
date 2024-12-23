package com.java.oop.composition;

public class Main {

    public static void main(String[] args) {
        Transmission cvtTransmission = new Transmission();
        cvtTransmission.setTransmissionType("CVT Auto");
        cvtTransmission.setNumGears(7);

        Engine fiatEngine = new Engine();
        fiatEngine.setEngineType("Diesel");
        fiatEngine.setTransmission(cvtTransmission);

        Chassis monoCoque = new Chassis();
        monoCoque.setChassisNum(1234565);
        monoCoque.setChassisType("Monocoque");

        Wheel radialTyre = new Wheel();
        radialTyre.setIsTubeless(true);
        radialTyre.setWheelMake("Bridgestone");

        Car jeepCompass = new Car();
        jeepCompass.setMake("Jeep");
        jeepCompass.setModel("Compass");
        jeepCompass.setChassis(monoCoque);
        jeepCompass.setEngine(fiatEngine);
        jeepCompass.setWheel(radialTyre);

        System.out.println(jeepCompass);
    }
}
