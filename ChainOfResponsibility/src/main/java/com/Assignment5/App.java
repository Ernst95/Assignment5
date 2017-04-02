package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    private static TransactionLogger getChainOfLoggers(){

        TransactionLogger pinLogger = new PinLogger(TransactionLogger.pin);
        TransactionLogger balanceLogger = new BalanceLogger(TransactionLogger.balance);
        TransactionLogger withdrawLogger = new WithdrawLogger(TransactionLogger.withdraw);

        pinLogger.setNextLogger(balanceLogger);
        balanceLogger.setNextLogger(withdrawLogger);

        return pinLogger;
    }

    public static void main(String[] args) {

        TransactionLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(TransactionLogger.pin,
                "This is the pin information.");

        loggerChain.logMessage(TransactionLogger.balance,
                "This is the balance information.");

        loggerChain.logMessage(TransactionLogger.withdraw,
                "This is withdraw information.");
    }
}
