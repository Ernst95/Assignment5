package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "eft")
    public EFT setUp()
    {
        return new EFT();
    }

    @Bean(name = "instantEFT")
    public InstantEFT setUp2()
    {
        return new InstantEFT();
    }

    @Bean(name = "proxy")
    public Proxy setUp3()
    {
        return new Proxy();
    }
}
