package com.stan;

import com.stan.animal.Car;

public class Main {
    public static void main(String[] args) {
        // this is the constructor
        // we initialize new Object of type Car
        // The Object is called stanCar which is our name (it can be any string)
        Car stanCar = new Car();
        stanCar.drive();
        stanCar.stop();
    }
}