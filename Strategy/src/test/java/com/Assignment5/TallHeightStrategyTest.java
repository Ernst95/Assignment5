package com.Assignment5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ernst on 2017/04/02.
 */
public class TallHeightStrategyTest {


    private TallHeightStrategy tHS;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tHS = (TallHeightStrategy) ctx.getBean("tHS");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCheckHeight() throws Exception{
        assertTrue(tHS.checkHeight(200));
    }

    @Test
    public void testNotNull() throws Exception{
        assertNotNull(tHS);
    }
}
