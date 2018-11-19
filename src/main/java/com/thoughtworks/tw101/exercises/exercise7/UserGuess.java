package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class UserGuess {

    public static int guessCorrect = 0;

    public int getUserGuess() {
        System.out.println("Please enter an integer guess between 1 and 100");
        Scanner in = new Scanner(System.in);
        String sGuess = in.nextLine();
        int intGuess = Integer.parseInt(sGuess);
        return intGuess;
    }

    public void checkGuess(int userGuess, int randInt) {

        if (userGuess < randInt) {
            System.out.println("Your guess is too low, try again!");
        }
        else if (userGuess > randInt) {
            System.out.println("Your guess is too high, try again!");
        }
        else if (userGuess == randInt) {
            System.out.println("You guessed the number correctly!");
            guessCorrect = 1;
        }
    }

}
