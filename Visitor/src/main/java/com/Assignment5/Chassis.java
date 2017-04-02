package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Chassis implements CarPart{

    private String chassisWeight;
    private double chassisPrice;

    public Chassis(String chassisWeight, double chassisPrice)
    {
        this.chassisWeight = chassisWeight;
        this.chassisPrice = chassisPrice;
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
