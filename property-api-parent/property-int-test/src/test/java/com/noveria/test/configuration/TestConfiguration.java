package com.noveria.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(value = {"com.noveria.test"})
@PropertySource("test.properties")
public class TestConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}