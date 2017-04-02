package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class TallHeightStrategy implements Strategy{

    public boolean checkHeight(double heightInC)
    {
        if((heightInC >= 161) && (heightInC <= 300))
            return true;
        else
            return false;
    }
}
