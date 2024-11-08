package com.java.demo;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        // switch(<VARIABLE>) {
        // ....
        // case 'MATCH1':
        // ....
        // break;
        // case 'MATCH2':
        // ...
        // break;
        // }
        String button = "121play";
        switch(button) {
            case "Play":
                System.out.println("Resumed playing...");
                break;
            case "Stop" :
                System.out.println("Play Stopped...");
                break;
            default:
                System.out.println("Invalid Input..");
                break;
        }
    }
}
