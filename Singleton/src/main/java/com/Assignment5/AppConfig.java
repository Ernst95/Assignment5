package com.Assignment5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/04/02.
 */
@Configuration
public class AppConfig {

    @Bean(name = "database")
    public DatabaseConnection setUp()
    {
        return new DatabaseConnection();
    }
}
