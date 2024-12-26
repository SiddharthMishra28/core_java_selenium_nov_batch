package com.java.oop.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // InterfaceName<DataType> variableName = new Implementation_Class
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("Hi");
        myList.add("Ola");
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        myList.add(1, "Adios");
        System.out.println(myList);
        System.out.println(myList.size());

        List<List<String>> myData = new ArrayList<>();
        List<String> headerRow = new ArrayList<>();
        headerRow.add("name");
        headerRow.add("email");
        headerRow.add("phone");
        headerRow.add("age");

        myData.add(headerRow);

        List<String> row1 = new ArrayList<>();
        row1.add("Sid");
        row1.add("sid@test.com");
        row1.add("3792173921");
        row1.add("34");

        myData.add(row1);

        System.out.println(myData);
    }
}
