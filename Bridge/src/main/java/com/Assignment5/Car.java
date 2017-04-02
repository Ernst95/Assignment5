package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public abstract class Car {

    protected Chassis chassis;

    public void setChassis(Chassis chassis)
    {
        this.chassis = chassis;
    }

    abstract public void colour();
}
