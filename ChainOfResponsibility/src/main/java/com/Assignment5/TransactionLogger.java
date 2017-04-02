package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public abstract class TransactionLogger {

    public static int pin = 1;
    public static int balance = 2;
    public static int withdraw = 3;

    protected int process;

    protected TransactionLogger nextLogger;

    public void setNextLogger(TransactionLogger nextLogger)
    {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int process, String message) {
        if (this.process <= process)
            write(message);
        if (nextLogger != null)
            nextLogger.logMessage(process, message);

    }

    abstract protected void write(String message);
}


