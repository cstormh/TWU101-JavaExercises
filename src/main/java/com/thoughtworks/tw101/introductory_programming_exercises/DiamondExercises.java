package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        System.out.println("Drawing an isosceles triangle...");
        drawAnIsoscelesTriangle(3);
        System.out.println("Drawing a diamond...");
        drawADiamond(3);
        System.out.println("Drawing a diamond with a name...");
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + 2 * i; k++) {
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

        drawAnIsoscelesTriangle(n);
        drawReverseTriangle(n);
    }


    private static void drawReverseTriangle(int n) {
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + 2 * i; k++) {
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
