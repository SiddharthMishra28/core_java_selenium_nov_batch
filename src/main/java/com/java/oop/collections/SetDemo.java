package com.java.oop.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
//        List<String> mySet = new ArrayList<>();
        mySet.add("Sid");
        mySet.add("siddharth");
        mySet.add("Bharath");
        mySet.add("Manjunath");
        System.out.println(mySet);
//        mySet.add("Sid");
//        mySet.add("siddharth");
//        mySet.add("Bharath");
//        mySet.add("Manjunath");
//        mySet.add("Sid");
//        mySet.add("siddharth");
//        mySet.add("Bharath");
//        mySet.add("Manjunath");
//        System.out.println(mySet);

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Sid");
        anotherSet.add("siddharth");
        anotherSet.add("Bharath");
        anotherSet.add("Manjunath");

//        NOT DIRECTLY COMPARABLE
//        if(mySet == anotherSet) {
//            System.out.println("EQUAL");
//        }
    }
}
