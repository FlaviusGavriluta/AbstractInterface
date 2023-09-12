package org.example.library;

public class Book extends LibraryItem{
    @Override
    public String checkout() {
        return "Book checked out";
    }
}
