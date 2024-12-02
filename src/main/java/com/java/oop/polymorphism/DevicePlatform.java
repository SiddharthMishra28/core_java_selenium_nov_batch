package com.java.oop.polymorphism;

public class DevicePlatform {
    String brand;
    String model;
    String ioModel;
    String os;
    String[] instructions;
    int ports;

    public void loadOs(String[] instructions) {
        this.instructions = new String[instructions.length];
        for(int i = 0; i<instructions.length; i++) {
            this.instructions[i] = instructions[i];
        }
    }

    public void boot() {
        this.os = instructions[0];
        System.out.println("Booting OS "+this.os);
    }
}
