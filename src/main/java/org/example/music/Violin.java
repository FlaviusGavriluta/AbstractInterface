package org.example.music;

public class Violin extends Instrument implements Tunable {
    private boolean isFineTuned;

    public Violin(String name, boolean isFineTuned) {
        super(name);
        this.isFineTuned = isFineTuned;
    }

    @Override
    public void play() {
        if (isFineTuned)
            System.out.println("Playing the violin.");
    }

    @Override
    public void fineTune() {
        isFineTuned = true;
    }
}