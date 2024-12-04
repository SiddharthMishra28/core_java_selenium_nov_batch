package com.java.oop;

public class ConstructorDemo {
    String connectionString;

    // new keyword - 1. Allocate memory for the new object instance
    //               2. Create and Invoke Constructor

    // CONSTRUCTOR CALLED ON CLASS INSTANTIATION
    public ConstructorDemo(String endPoint) {
        this.connectionString = endPoint;
        System.out.println("Connected to data base with parameter : "+this.connectionString);
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo("mysql://host@port");
    }
}
