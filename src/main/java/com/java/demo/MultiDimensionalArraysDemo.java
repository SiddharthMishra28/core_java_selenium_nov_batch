package com.java.demo;

public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {
        // --------------------------------------->
        // | name | age | email |
        // | bharath| 25 | bharath@gmai.com |
        // | manjunath | 25 | manjunath@rediff.com |
        String[][] studentsData = {
                {"name", "age", "email"}, // 0
                // 0       1       2
                {"bharath", "25", "bharath@gmail.com"}, // 1
                //  0         1       2
                {"manjunath", "25", "manjunath@rediff.com", "hello"},  // 2
                {"avanish", "27", "avanish@hotmail.com"},   // 3
        };
//        System.out.println(studentsData[1][2]);
        for(int i=0; i<studentsData.length; i++) {
            for(int j=0; j<studentsData[i].length; j++) {
                System.out.println(studentsData[i][j]);
            }
        }
    }
}
