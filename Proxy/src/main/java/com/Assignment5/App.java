package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Proxy proxy = new Proxy();

        InstantEFT iEFT = new InstantEFT();
        iEFT.deposit();

        proxy.deposit();
    }
}
