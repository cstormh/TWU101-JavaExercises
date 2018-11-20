package com.thoughtworks.tw101.exercises.exercise8;

public class RandomNumber {

    static private double randomDouble = (Math.random()*100) + 1;

    public int getRandomInteger() {
        return (int) randomDouble;
    }
}
