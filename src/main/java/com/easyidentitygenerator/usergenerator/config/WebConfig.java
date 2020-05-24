package com.easyidentitygenerator.usergenerator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig {
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "PATCH", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
