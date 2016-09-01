package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by reepa on 01-06-2016.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Profile("development")
    DataSource development() {
        return new DataSource("devp-url",9999);
    }

    @Bean(name = "datasource")
    @Profile("production")
    DataSource production() {
        return new DataSource("prod-url",1000);
    }
}
