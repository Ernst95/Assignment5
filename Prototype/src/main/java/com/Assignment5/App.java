package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car1 = new Car("SUV");
        System.out.println("Car 1: " + car1);
        Car car2 = (Car)car1.makeCopy();
        System.out.println("Car 2: " + car2);

        Boat boat1 = new Boat("Yacht");
        System.out.println("Boat 1: " + boat1);
        Boat boat2 = (Boat)boat1.makeCopy();
        System.out.println("Boat 2: " + boat2);
    }
}
