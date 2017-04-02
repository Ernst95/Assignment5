package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class BalanceLogger extends TransactionLogger{

    public BalanceLogger(int process)
    {
        this.process = process;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("Balance Logger " + message);
    }
}
