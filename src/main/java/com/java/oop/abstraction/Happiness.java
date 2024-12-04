package com.java.oop.abstraction;

public class Happiness extends UserSentiment{
    public static void main(String[] args) {
        Happiness h = new Happiness();
        h.simulateMood();
    }

    @Override
    public void determineUserMood(String speech) {

    }
}
