package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        ArrayList<String> booksContainTitle  = new ArrayList<>();

        for (String book:books) {
            if (book.contains(partialBookTitle))
                booksContainTitle.add(book);
        }

        printStream.println(booksContainTitle);
    }
}
