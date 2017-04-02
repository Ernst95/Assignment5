package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)
    {
        AbstractFactory carFactory = FactoryProducer.getFactory("Car");

        Car car1 = carFactory.getCar("SUV");

        car1.carType();
    }

}
