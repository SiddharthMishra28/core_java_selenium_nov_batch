package com.java.procedural;

public class SingleDimensionalArraysDemo {
    // Need to know the data size in advance || determine the data size
    // Homogeneous data - Object Arrays as well! (Exception)
    // <DATA_TYPE>[] <VARIABLE_NAME> = {"VALUES"};
    // <DATA_TYPE>[] <VARIABLE_NAME> = new <DATA_TYPE>[SIZE];
    public static void main(String[] args) {
        String[] students = {"Bharath", "Manjunath", "Avanish"};
//                                   0           1           2
//        String[] students = new String[3];
        // linear - X axis
        for(int i=0; i<students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
