package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        CarPart car = new Car();
        car.accept(new CarPartDisplayVisitor());
    }
}
