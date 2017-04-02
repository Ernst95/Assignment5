package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Car implements CarPart {

    CarPart[] parts;

    public Car()
    {
        parts = new CarPart[] {new Engine("1300",7000), new Chassis("1 ton",15000), new Interior("Leather", 8000)};
    }

    public void accept(CarPartVisitor carPartVisitor)
    {

        for (int i = 0; i < parts.length; i++)
            parts[i].accept(carPartVisitor);

        carPartVisitor.visit(this);

    }
}
