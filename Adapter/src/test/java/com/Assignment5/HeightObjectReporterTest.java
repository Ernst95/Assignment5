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
public class HeightObjectReporterTest {

    private HeightObjectReporter hObj;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hObj = (HeightObjectReporter)ctx.getBean("heightObj");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetHeightInM() throws Exception {
        hObj.setHeightInM(100);
        assertEquals(100, hObj.getHeightInM(),0);
    }

    @Test
    public void testGetHeightInF() throws Exception {
        hObj.setHeightInF(6);
        assertEquals(6, hObj.getHeightInF(),0);
    }

    @Test
    public void testSetHeightInM() throws Exception {
        hObj.setHeightInM(100);
        assertEquals(100, hObj.getHeightInM(),0);
    }

    @Test
    public void testSetHeightInF() throws Exception {
        hObj.setHeightInM(100);
        assertEquals(100, hObj.getHeightInM(),0);
    }

    @Test
    public void testFToM() throws Exception{
        assertEquals(2, hObj.fToM(6.56168),0);
    }

    @Test
    public void testMToF() throws Exception{
        assertEquals(6.56168, hObj.mToF(2),0);
    }

    @Test
    public void testNotNull() throws Exception{
        assertNotNull(hObj);
    }

}