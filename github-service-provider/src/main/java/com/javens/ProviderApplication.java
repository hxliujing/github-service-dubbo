package com.javens;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring/spring-service-base.xml")
public class ProviderApplication {
    private static final Logger log = LoggerFactory.getLogger(ProviderApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
        log.info("github-service-provider  success----------");
    }
}
