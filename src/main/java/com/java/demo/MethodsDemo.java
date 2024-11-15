package com.java.demo;

public class MethodsDemo {
    // <ACCESS_SPECIFIER> <RETURN_TYPE> <METHOD_NAME>(...arguments) {
    // ...
    // ...
    // }

    public int addNumbers(int num1, int num2, int num3) {
//        if(num1%2) {
//
//        }
        return num1+num2+num3;
    }

    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static void main(String[] args) {
        // IN JAVA ANONYMOUS NAMED FUNCTION CALL IS NOT ALLOWED
        MethodsDemo demo = new MethodsDemo();
        int sum = demo.addNumbers(12, 45, 21);
        int product = demo.multiply(5,23);
        System.out.println(sum);
        System.out.println(product);
//        System.out.println(demo.addNumbers(12, 45, 21));
    }
}
