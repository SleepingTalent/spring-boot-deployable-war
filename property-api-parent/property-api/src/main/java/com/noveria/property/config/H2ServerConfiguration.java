package com.noveria.property.config;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.SQLException;

@Configuration
@Profile("h2")
public class H2ServerConfiguration {

    @Value("${spring.h2.tcp.port:9092}")
    private String h2TcpPort;

    @Value("${spring.h2.web.port:8082}")
    private String h2WebPort;

    @Bean
    @ConditionalOnExpression("${spring.h2.tcp.enabled:false}")
    public Server h2TcpServer() throws SQLException {
       return Server.createTcpServer("-tcp","-tcpAllowOthers","-tcpPort", h2TcpPort).start();
    }

    @Bean
    @ConditionalOnExpression("${spring.h2.web.enabled:false}")
    public Server h2WebServer() throws SQLException {
        return Server.createWebServer("-web","-webAllowOthers","-webPort", h2WebPort).start();
    }
}
