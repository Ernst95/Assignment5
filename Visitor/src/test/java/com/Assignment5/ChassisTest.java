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
public class ChassisTest {

    private Chassis chassis;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        chassis = (Chassis)ctx.getBean("chassis");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetChassisWeight() throws Exception {
        assertEquals("1 ton", chassis.getChassisWeight());
    }

    @Test
    public void testGetChassisPrice() throws Exception {
        assertEquals(8000,chassis.getChassisPrice(),0);
    }

    @Test
    public void testNotNull() throws Exception
    {
        assertNotNull(chassis);
    }

}