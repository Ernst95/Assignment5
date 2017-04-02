package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double heightInC = 150;
        double heightInC1 = 202;

        Strategy shortHeightStrategy = new ShortHeightStrategy();
        Context context = new Context(heightInC, shortHeightStrategy);

        System.out.println("Is the height " + context.getHeightInC() + "cm classified as 'short'? " + context.getResult());

        Strategy tallHeightStrategy = new TallHeightStrategy();
        Context context1 = new Context(heightInC1, tallHeightStrategy);

        System.out.println("Is the height " + context1.getHeightInC() + "cm classified as 'tall'? " + context1.getResult());
    }
}
