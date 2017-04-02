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
public class ContextTest {

    private Context context;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        context = (Context)ctx.getBean("context");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetHeightInC() throws Exception {
        assertEquals(150, context.getHeightInC(),0);
    }

    @Test
    public void testNotNull() throws Exception{
        assertNotNull(context);
    }

}