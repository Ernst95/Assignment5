package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "carFactory")
    public CarFactory setUp()
    {
        return new CarFactory();
    }

    @Bean(name = "coupe")
    public Coupe setUp1()
    {
        return new Coupe();
    }

    @Bean(name = "suv")
    public SUV setUp2()
    {
        return new SUV();
    }

    @Bean(name = "factoryProducer")
    public FactoryProducer setUp3()
    {
        return new FactoryProducer();
    }
}
