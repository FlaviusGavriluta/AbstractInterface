package org.example.library;

public abstract class LibraryItem {
    protected String title;

    public abstract String checkout();

    public String returnItem() {
        return "Item returned";
    }
}
