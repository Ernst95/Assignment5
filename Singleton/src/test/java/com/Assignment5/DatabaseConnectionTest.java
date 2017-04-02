package com.Assignment5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/04/01.
 */
public class DatabaseConnectionTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("In Before...");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConnectMessage() throws Exception {
        DatabaseConnection databaseC = DatabaseConnection.getInstance();
        assertEquals("Database connection successful...", databaseC.connectMessage());
    }

    @Test
    public void testNotNull() throws Exception {
        DatabaseConnection databaseC = DatabaseConnection.getInstance();
        assertNotNull(databaseC);
    }

}