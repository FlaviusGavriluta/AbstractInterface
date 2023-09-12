package org.example.music;

public class Guitar extends Instrument {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar.");
    }
}