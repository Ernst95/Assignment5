package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class PinLogger extends TransactionLogger{

    public PinLogger(int process)
    {
        this.process = process;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("Pin Logger " + message);
    }
}
