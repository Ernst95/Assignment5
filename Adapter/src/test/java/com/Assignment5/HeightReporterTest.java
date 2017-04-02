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
public class HeightReporterTest {

    private HeightReporter hRep;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hRep = (HeightReporter)ctx.getBean("heightRep");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getHeight() throws Exception {
        hRep.setHeight(2);
        assertEquals(2, hRep.getHeight(),0);
    }

    @Test
    public void setHeight() throws Exception {
        hRep.setHeight(2);
        assertEquals(2, hRep.getHeight(),0);
    }

    @Test
    public void testNotNull() throws Exception{
        assertNotNull(hRep);
    }

}