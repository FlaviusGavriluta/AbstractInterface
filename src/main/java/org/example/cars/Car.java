package org.example.cars;

public class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void accelerate() {
        this.speed += 10;
    }
}
