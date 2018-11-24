package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        System.out.println("Printing an isosceles triangle...");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + 2*i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        System.out.println("Printing a diamond...");

        int i;
        int j;
        int k;
        int l;
        int m;
        int o;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 1 + 2*i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {

    }
}
