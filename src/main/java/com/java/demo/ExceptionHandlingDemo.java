package com.java.demo;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // ERRORS - Terminal
        // EXCEPTIONS CAN BE HANDLED
        // try {
        //   .....
        //   ... PROGRAM LOGIC
        // catch(NumberFormatException e) {
        //   ...
        // }
        int num1 = 3;
        int num2 = 2;
        try {
            int quotient = num1/num2;
            System.out.println(quotient);
        }catch(ArithmeticException e) {
            System.out.println("Some Message");
        }catch(Exception e) {
            System.out.println("Denominator Should not be 0");
        }
    }
}
