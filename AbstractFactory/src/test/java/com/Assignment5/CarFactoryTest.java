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
public class CarFactoryTest {

    private CarFactory carF;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        carF = (CarFactory)ctx.getBean("carFactory");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetCar() throws Exception {
        assertNotNull(carF.getCar("SUV"));
    }

}