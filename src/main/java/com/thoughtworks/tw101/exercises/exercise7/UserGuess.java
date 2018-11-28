package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class UserGuess {

    public int getUserGuess() {
        System.out.println("Please enter an integer guess between 1 and 100");
        Scanner in = new Scanner(System.in);
        String sGuess = in.nextLine();
        int intGuess = Integer.parseInt(sGuess);
        return intGuess;
    }

    public boolean checkGuess(int userGuess, int randInt) {

        if (userGuess < randInt) {
            System.out.println("Your guess is too low, try again!");
            return false;
        } else if (userGuess > randInt) {
            System.out.println("Your guess is too high, try again!");
            return false;
        } else {
            System.out.println("You guessed the number correctly!");
            return true;
        }
    }
}
