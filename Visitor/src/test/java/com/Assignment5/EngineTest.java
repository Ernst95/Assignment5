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
public class EngineTest {

    private Engine engine;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        engine = (Engine) ctx.getBean("engine");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetEngineSize() throws Exception {
        assertEquals("1300", engine.getEngineSize());
    }

    @Test
    public void testGetEginePrice() throws Exception {
        assertEquals(7000, engine.getEnginePrice(),0);
    }

    @Test
    public void testNotNull() throws Exception
    {
        assertNotNull(engine);
    }

}
