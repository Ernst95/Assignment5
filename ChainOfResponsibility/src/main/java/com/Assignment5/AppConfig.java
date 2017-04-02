package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "bLogger")
    public BalanceLogger setUp()
    {
        return new BalanceLogger();
    }

    @Bean(name = "pLogger")
    public PinLogger setUp2()
    {
        return new PinLogger();
    }

    @Bean(name = "wLogger")
    public WithdrawLogger setUp3()
    {
        return new WithdrawLogger();
    }
}
