package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car setUp()
    {
        return new Car();
    }

    @Bean(name = "carPDV")
    public CarPartDisplayVisitor setUp2()
    {
        return new CarPartDisplayVisitor();
    }

    @Bean(name = "chassis")
    public Chassis setUp3()
    {
        return new Chassis("1 ton",8000);
    }

    @Bean(name = "engine")
    public Engine setUp4()
    {
        return new Engine("1300",7000);
    }

    @Bean(name = "interior")
    public Interior setUp5()
    {
        return new Interior("Leather",8000);
    }

}
