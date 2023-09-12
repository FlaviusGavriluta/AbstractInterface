package org.example.cars;

public class ElectricCar extends Vehicle implements Electric {
    private boolean fullyCharged;

    public ElectricCar(String brand, int speed, boolean fullyCharged) {
        super(brand, speed);
        this.fullyCharged = fullyCharged;
    }

    @Override
    public void charge() {
        fullyCharged = true;
    }

    @Override
    public boolean isFullyCharged() {
        return fullyCharged;
    }

    @Override
    public void accelerate() {
        if (fullyCharged)
            this.speed += 15;
    }
}
