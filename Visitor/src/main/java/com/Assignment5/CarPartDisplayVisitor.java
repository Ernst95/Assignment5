package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class CarPartDisplayVisitor implements CarPartVisitor {

    public void visit(Car car) {
        System.out.println("Displaying Car.");
    }

    public void visit(Engine engine) {
        System.out.println("Displaying Engine.");
    }

    public void visit(Chassis chassis) {
        System.out.println("Displaying Chassis.");
    }

    public void visit(Interior interior) {
        System.out.println("Displaying Interior.");
    }
}