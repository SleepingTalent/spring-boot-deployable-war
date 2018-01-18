package com.noveria.property.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.noveria.property.model.domain")
@EnableJpaRepositories("com.noveria.property.model.repositories")
@EnableTransactionManagement
public class DatabaseConfiguration {
}
