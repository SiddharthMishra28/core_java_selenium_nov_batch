package com.java.demo;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        // if, else, else if, nested if
        // if(<CONDITION>) {
        // ......
        // }
//        int age = 17;
//        if(age > 18) {
//            System.out.println("Ready to Vote!");
//        }else {
//            System.out.println("Not Ready To vote Yet!");
//        }
        int age = 22;
        String country = "IN";

//        if(age > 18){
//            if(country=="IN"){
//                System.out.println("Ready to Vote");
//            }else {
//                System.out.println("Cannot Vote in India");
//            }
//        }else if(age > 21) {
//            if(country=="Other"){
//                System.out.println("Ready to vote");
//            }
//        }else {
//            System.out.println("Not Ready to vote");
//        }
            if(age > 18 && country == "IN") {
                System.out.println("Elligible to Vote in India");
            }else if(age > 21 && country == "Other") {
                System.out.println("Elligible to vote in other country");
            }else {
                System.out.println("Not Elligible to Vote");
            }
    }
}
