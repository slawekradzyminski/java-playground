package com.stan;

import com.stan.car.Car;

public class Main {
    public static void main(String[] args) {
        // this is the constructor
        // we initialize new Object of type Car
        // The Object is called slawekCar which is our name (it can be any string)
        Car slawekCar = new Car();
        slawekCar.drive();
        slawekCar.stop();
        slawekCar.honk();
        slawekCar.setOwnerName("Slawomir Radzyminski");
    }
}