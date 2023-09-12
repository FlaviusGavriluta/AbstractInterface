package org.example.library;

public class EBook extends LibraryItem implements Digital{
    @Override
    public String download() {
        return "EBook downloaded.";
    }

    @Override
    public String checkout() {
        return "EBook checked out.";
    }
}
