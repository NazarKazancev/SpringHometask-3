package com.example.hometask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SimpleConfig.class)
public class HometaskApplication {
    private static SmsSender smsSender;
    private static ConfigEventPublisher publisher;
    private static SimpleConfig simpleConfig;

    public HometaskApplication(SmsSender smsSender, ConfigEventPublisher publisher, SimpleConfig simpleConfig) {
        HometaskApplication.smsSender = smsSender;
        HometaskApplication.simpleConfig = simpleConfig;
        HometaskApplication.publisher = publisher;
    }


    public static void main(String[] args) {
        SpringApplication.run(HometaskApplication.class, args);
        smsSender.send("8800553535", "HELLO, WHERE IS MY MONEY?");
        publisher.publishCustomEvent(simpleConfig);
    }


}
