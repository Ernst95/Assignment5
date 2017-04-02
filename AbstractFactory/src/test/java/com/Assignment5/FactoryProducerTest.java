package com.Assignment5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Ernst on 2017/04/02.
 */
public class FactoryProducerTest {


    private FactoryProducer factoryProducer;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        factoryProducer = (FactoryProducer) ctx.getBean("factoryProducer");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNotNull() throws Exception {
        assertNotNull(factoryProducer);
    }
}
