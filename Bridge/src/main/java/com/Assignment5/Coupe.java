package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class Coupe extends Car {

    public Coupe()
    {

    }

    public Coupe(Chassis chassis) {

        this.chassis = chassis;
    }

    public void colour() {
        System.out.println("Chassis: Coupe");
        chassis.colour();
    }
}
