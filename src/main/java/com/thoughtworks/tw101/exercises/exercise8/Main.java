package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            // Get random number for the game
            RandomNumber randomNumber = new RandomNumber();
            int randInt1 = randomNumber.getRandomInteger();

            UserGuess userGuess = new UserGuess();
            ArrayList<Integer> userGuessArrayList = new ArrayList<>();

            // Ask for and check user guesses against random number
            do {

                try {
                    int userGuess1 = userGuess.getUserGuess();
                    userGuessArrayList.add(userGuess1);
                    userGuess.checkGuess(userGuess1,randInt1);
                }
                catch (NumberFormatException e) {
                    System.out.println("Please enter a valid integer to play the game!");
                }
            }
            while (UserGuess.guessCorrect == 0);

            // Print all user guesses after they guess correctly
            System.out.println("Here is the list of all your guesses in the game:");
            System.out.println(userGuessArrayList);
            System.out.printf("You made %d total guesses in the game.\n",userGuessArrayList.size());

    }
}
