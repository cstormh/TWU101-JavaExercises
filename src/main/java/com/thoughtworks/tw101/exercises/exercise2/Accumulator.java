package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    private int count = 0;

    public void increment() {
        System.out.println("Add one more");
        count++;
     }

    public void total() {
         System.out.println("Total is: " + count);
    }
}
