package com.Assignment5;

/**
 * Created by Ernst on 2017/04/02.
 */
public class Proxy {

    EFT eft;

    public Proxy(){
        System.out.println("Creating proxy...");
    }

    public void deposit() {
        if (eft == null)
            eft = new EFT();
        eft.deposit();
    }

}
