package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class ShortHeightStrategy implements Strategy{

    public ShortHeightStrategy()
    {

    }

    public boolean checkHeight(double heightInC)
    {
        if((heightInC >= 0) && (heightInC <= 160))
            return true;
        else
            return false;
    }
}
