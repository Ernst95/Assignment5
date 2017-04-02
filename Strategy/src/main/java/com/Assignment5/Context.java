package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Context {

    double heightInC;
    Strategy strategy;

    public Context(double heightInC, Strategy strategy)
    {
        this.heightInC = heightInC;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public double getHeightInC()
    {
        return heightInC;
    }

    public boolean getResult()
    {
        return strategy.checkHeight(heightInC);
    }
}
