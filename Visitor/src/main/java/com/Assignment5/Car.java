package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Car implements CarPart {

    CarPart[] parts;

    public Car()
    {
        parts = new CarPart[] {new Engine(), new Chassis(), new Interior()};
    }

    public void accept(CarPartVisitor carPartVisitor)
    {

        for (int i = 0; i < parts.length; i++)
            parts[i].accept(carPartVisitor);

        carPartVisitor.visit(this);

    }
}
