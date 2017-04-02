package com.Assignment5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Ernst on 2017/04/02.
 */
public class InteriorTest {

    private Interior interior;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        interior = (Interior) ctx.getBean("interior");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetInteriorType() throws Exception {
        assertEquals("Leather", interior.getInteriorType());
    }

    @Test
    public void testGetInteriorPrice() throws Exception {
        assertEquals(8000, interior.getInteriorPrice(),0);
    }

    @Test
    public void testNotNull() throws Exception
    {
        assertNotNull(interior);
    }

}
