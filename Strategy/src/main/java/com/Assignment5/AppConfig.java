package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    private Strategy strategy;

    @Bean(name = "context")
    public Context setUp()
    {
        return new Context(150,strategy);
    }

    @Bean(name = "sHS")
    public ShortHeightStrategy setUp2()
    {
        return new ShortHeightStrategy();
    }

    @Bean(name = "tHS")
    public TallHeightStrategy setUp3()
    {
        return new TallHeightStrategy();
    }
}
