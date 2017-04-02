package com.Assignment5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by Ernst on 2017/04/02.
 */
public class BoatTest {

    private Boat boat;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        boat = (Boat)ctx.getBean("boat");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testMakeCopy() throws Exception {
        assertNotNull(boat.makeCopy());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Boat Category: Yacht", boat.toString());
    }

}