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

        List<Integer> primeFactors = generate(30);
        System.out.println("Printing prime factors:");
        System.out.println(primeFactors);
    }

    private static List<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();



        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        ArrayList<Integer> primeFactors = new ArrayList<>(factors);

        System.out.println("Printing all factors:");
        System.out.println(factors);


        for (Integer factor:factors) {
            for (int i = 2; i < factor; i++) {
                if (factor % i == 0 && !factor.equals(i)) {
                    primeFactors.remove(factor);
                    break;
                }
            }
        }

//        for (Integer factor:Factors) {
//            for (int i = 2; i < factor; i++) {
//                if (factor % i == 0 && !factor.equals(i)) {
//                    removeFactors.add(factor);
//                    break;
//                }
//            }
//        }
//
//        System.out.println("Printing all non-prime factors:");
//        System.out.println(removeFactors);
//
//
//        for (Integer removeFactor:removeFactors) {
//            int removeIndex = Factors.indexOf(removeFactor);
//            Factors.remove(removeIndex);
//        }
//
        return primeFactors;
    }
}
