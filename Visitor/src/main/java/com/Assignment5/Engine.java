package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Engine implements CarPart{

    private String engineSize;
    private double enginePrice;

    public Engine()
    {

    }

    public void accept(CarPartVisitor carPartVisitor)
    {
        carPartVisitor.visit(this);
    }

    public String getEngineSize()
    {
        return engineSize;
    }

    public double getEnginePrice()
    {
        return enginePrice;
    }
}
