package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class WithdrawLogger extends TransactionLogger{

    public WithdrawLogger()
    {

    }

    public WithdrawLogger(int process)
    {
        this.process = process;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("Withdraw Logger " + message);
    }
}
