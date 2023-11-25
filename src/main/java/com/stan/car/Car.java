package com.stan.car;

public class Car {

    // these are the fields
    int mileage;
    int manufacturingDate;
    String ownerName;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // these are the methods
    public void drive() {
        System.out.println("The car is driving");
    }

    public void stop() {
        System.out.println("The car is stopping");
    }

    public void honk() {
        System.out.println("beep");
    }

}
