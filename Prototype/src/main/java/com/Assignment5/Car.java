package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class Car implements CloneObject{

    private String carType;

    public Car()
    {

    }

    public Car(String carType)
    {
        this.carType = carType;
    }

    public CloneObject makeCopy()
    {
        return new Car(carType);
    }

    public String toString()
    {
        return "Car Category: " + carType;
    }

}
