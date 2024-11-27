package com.java.procedural;

import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        String[][] employees = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int numEmployees = sc.nextInt();
        sc.nextLine();
        employees = new String[numEmployees][3];
        for(int i=0; i<numEmployees; i++){
            System.out.println("Enter Employee ID");
            employees[i][0] = sc.nextLine();
            System.out.println("Enter Employee Name");
            employees[i][1] = sc.nextLine();
            System.out.println("Enter Employee Salary");
            employees[i][2] = sc.nextLine();
        }
        System.out.println("Employee Records:");
        for(int j=0; j<numEmployees; j++) {
            System.out.println("Id "+employees[j][0]);
            System.out.println("Name "+employees[j][1]);
            System.out.println("Salary "+employees[j][2]);
        }
    }
}
