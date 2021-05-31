package com.example.hometask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SimpleConfig.class)
public class HometaskApplication {
    private static ConfigEventPublisher publisher;
    private static SimpleConfig simpleConfig;

    public HometaskApplication(ConfigEventPublisher publisher, SimpleConfig simpleConfig) {
        HometaskApplication.publisher = publisher;
        HometaskApplication.simpleConfig = simpleConfig;
    }

    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
        publisher.publishCustomEvent(simpleConfig);
    }


}
