package org.example;

import org.example.cars.Car;
import org.example.cars.ElectricCar;
import org.example.library.Book;
import org.example.library.EBook;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Opel", 90);
        System.out.println("Speed: " + myCar.getSpeed() + "km/h then accelerate: ");
        myCar.accelerate();
        System.out.println("Check the speed again: " + myCar.getSpeed() + "km/h");

        System.out.println("--------------------------------");

        ElectricCar myNewCar = new ElectricCar("Dacia", 110, false);
        System.out.println("Speed: " + myNewCar.getSpeed() + "km/h then accelerate: ");
        myNewCar.accelerate();
        System.out.println("Check the speed again: " + myNewCar.getSpeed() + "km/h");

        System.out.println("--------------------------------");
        System.out.println("Speed: " + myNewCar.getSpeed() + "km/h then accelerate: ");
        myNewCar.charge();
        myNewCar.accelerate();
        System.out.println("Check the speed again: " + myNewCar.getSpeed() + "km/h");

        System.out.println("--------------------");

        Book myBook = new Book();
        System.out.println(myBook.returnItem());
        System.out.println(myBook.checkout());

        System.out.println("--------------------");

        EBook myEBook = new EBook();
        System.out.println(myEBook.returnItem());
        System.out.println(myEBook.checkout());
        System.out.println(myEBook.download());
    }
}