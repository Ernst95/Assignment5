package com.Assignment5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DatabaseConnection databaseC = DatabaseConnection.getInstance();
        databaseC.connectMessage();
    }
}
