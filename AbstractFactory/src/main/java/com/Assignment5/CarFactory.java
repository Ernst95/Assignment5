package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class CarFactory extends AbstractFactory{

    public Car getCar(String carType)
    {
        if(carType == null)
            return null;

        if(carType == "SUV")
            return new SUV();
        else if (carType == "Coupe")
            return new Coupe();

        return null;
    }
}
