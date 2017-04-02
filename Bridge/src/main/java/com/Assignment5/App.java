package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        Car coupe = new Coupe(new Blue());
        coupe.colour();

        Car suv = new SUV(new Red());
        suv.colour();

    }
}
