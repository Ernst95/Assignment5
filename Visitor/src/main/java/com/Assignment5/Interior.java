package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Interior implements CarPart{

    private String interiorType;
    private double interiorPrice;

    public Interior()
    {

    }

    public void accept(CarPartVisitor carPartVisitor)
    {
        carPartVisitor.visit(this);
    }

    public String getInteriorType()
    {
        return interiorType;
    }

    public double getInteriorPrice()
    {
        return interiorPrice;
    }
}
