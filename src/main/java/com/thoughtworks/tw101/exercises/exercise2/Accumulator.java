package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {

    static int count = 0;

    int increment() {
        count++;
        return count;
     }

    void total() {
         System.out.println("Total is: " + count);
    }
}
