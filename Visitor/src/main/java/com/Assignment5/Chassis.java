package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Chassis implements CarPart{

    private String chassisWeight;
    private double chassisPrice;

    public Chassis()
    {

    }

    public void accept(CarPartVisitor carPartVisitor)
    {
        carPartVisitor.visit(this);
    }

    public String getChassisWeight()
    {
        return chassisWeight;
    }

    public double getChassisPrice()
    {
        return chassisPrice;
    }
}
