package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "blue")
    public Blue setUp()
    {
        return new Blue();
    }

    @Bean(name = "coupe")
    public Coupe setUp1(){
        return new Coupe();
    }

    @Bean(name = "red")
    public Red setUp3()
    {
        return new Red();
    }

    @Bean(name = "suv")
    public SUV setUp4(){
        return new SUV();
    }
}
