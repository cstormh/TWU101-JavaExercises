package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int total = 0;

        for (int i = start; i <= end; i = i + 1) {
            if (i % 2 != 0) {
                total = total + i;
            }
        }
        return total;
    }
}
