package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class SUV extends Car{

    public SUV()
    {

    }

    public SUV(Chassis chassis)
    {
        this.chassis = chassis;
    }

    public void colour()
    {
        System.out.println("Chassis: SUV");
        chassis.colour();
    }
}
