package org.example.music;

public abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public abstract void play();

    public void tune() {  // Concrete method
        System.out.println("Tuning the instrument.");
    }

    public String getName() {
        return name;
    }
}