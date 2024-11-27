package com.java.procedural;

public class LoopsDemo {
    public static void main(String[] args) {
        // for, while, do while
        // for(<INITIALIZATION>; <CONDITION>; <INCREMENT/DECREMENT>){
        // ....
        // }
//        for(int i=1; i<=100; i++){
//            System.out.println("Running Iteration "+i);
//        }

        // while(<CONDITION>) {
        // ...
        // }
        int i = 101;
//        while(i<=100) {
//            System.out.println("Running Iteration "+i);
//            i++;
//        }

        // do {
        // ....
        // }while(<CONDITION>);
        do {
            System.out.println("Iterating "+i);
            i++;
        }while(i<=105);
    }
}
