package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // class adapter
        System.out.println("class adapter test");
        Height height = new HeightObjectReporter();
        testHeight(height);

        // object adapter
        System.out.println("\nobject adapter test");
        height = new HeightObjectReporter();
        testHeight(height);
    }

    public static void testHeight(Height height)
    {
        height.setHeightInM(0);
        System.out.println("Height in M:" + height.getHeightInM());
        System.out.println("Height in F:" + height.getHeightInF());

        height.setHeightInM(50);
        System.out.println("Height in M:" + height.getHeightInM());
        System.out.println("Height in F:" + height.getHeightInF());
    }
}
