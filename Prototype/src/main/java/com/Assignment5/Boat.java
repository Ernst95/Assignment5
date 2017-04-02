package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class Boat implements CloneObject{

    private String boatType;

    public Boat()
    {

    }

    public Boat(String boatType)
    {
        this.boatType = boatType;
    }

    public CloneObject makeCopy()
    {
        return new Boat(boatType);
    }

    public String toString()
    {
        return "Boat Category: " + boatType;
    }
}
