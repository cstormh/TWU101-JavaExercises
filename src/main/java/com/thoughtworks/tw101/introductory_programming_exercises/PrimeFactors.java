package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {

        List<Integer> primeFactors = generate(77);
        System.out.println("Printing prime factors:");
        System.out.println(primeFactors);
    }

    private static List<Integer> generate(int n) {
        ArrayList<Integer> Factors = new ArrayList<>();
        ArrayList<Integer> removeFactors = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                Factors.add(i);
            }
        }

        System.out.println("Printing all factors:");
        System.out.println(Factors);


        for (Integer factor:Factors) {
            for (int i = 2; i < factor; i++) {
                if (factor.equals(i)) {
                    boolean doNothing = true;
                }
                else if (removeFactors.contains(factor)) {
                    boolean doNothing = true;
                }
                else if (factor % i == 0) {
                        removeFactors.add(factor);
                }
            }
        }

        System.out.println("Printing all non-prime factors:");
        System.out.println(removeFactors);


        for (Integer removeFactor:removeFactors) {
            int removeIndex = Factors.indexOf(removeFactor);
            Factors.remove(removeIndex);
        }

        return Factors;
    }
}
