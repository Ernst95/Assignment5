package com.Assignment5;

/**
 * Created by Ernst on 2017/04/01.
 */
public class DatabaseConnection {

    private static DatabaseConnection databaseC = null;

    private DatabaseConnection()
    {

    }

    public static DatabaseConnection getInstance()
    {
        if (databaseC == null)
        {
            databaseC = new DatabaseConnection();
        }
        return databaseC;
    }

    public String connectMessage()
    {
        return "Database connection successful...";
    }
}
