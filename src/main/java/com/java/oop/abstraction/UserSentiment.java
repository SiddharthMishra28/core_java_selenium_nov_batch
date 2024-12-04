package com.java.oop.abstraction;

public abstract class UserSentiment {

    String mood;
    String reflexQ;

    public void simulateMood() {
        System.out.println("Simulating Happiness..");
    }

    public abstract void determineUserMood(String speech);
}
