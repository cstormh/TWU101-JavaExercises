package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        ArrayList<String> booksContainTitle  = new ArrayList<>();

        for (String s:books) {
            if (s.contains(partialBookTitle))
                booksContainTitle.add(s);
        }

        System.out.println(booksContainTitle);
    }
}
