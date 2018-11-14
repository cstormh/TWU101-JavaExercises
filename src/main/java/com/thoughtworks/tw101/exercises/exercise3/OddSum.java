package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int startOdd = 0;
        int endOdd = 0;
        int total = 0;

        if (start % 2 == 0)
                startOdd = start+1;
        else
            startOdd = start;

        if (end % 2 == 0)
                endOdd = end - 1;
        else
            endOdd = end;

        for (int i = startOdd; i <= endOdd ; i=i+2) {
            total = total + i;
        }

        return total;
    }
}
