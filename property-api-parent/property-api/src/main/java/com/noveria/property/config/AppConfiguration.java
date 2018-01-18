package com.noveria.property.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.noveria.property")
@Import({DatabaseConfiguration.class, SwaggerConfiguration.class})
public class AppConfiguration {
}
