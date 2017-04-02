package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("Car"))
            return new CarFactory();

        return null;
    }
}
