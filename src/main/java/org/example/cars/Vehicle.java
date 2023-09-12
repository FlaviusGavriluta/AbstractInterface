package org.example.cars;

public abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void accelerate();

    public void honk() {
        System.out.println("Honk Honk!");
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
}
