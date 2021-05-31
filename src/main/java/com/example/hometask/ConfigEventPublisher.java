package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ConfigEventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public ConfigEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent(final SimpleConfig simpleConfig) {
        System.out.println("Publishing custom event. ");

        ConfigEvent configEvent = new ConfigEvent(this, simpleConfig);
        applicationEventPublisher.publishEvent(configEvent);
    }
}
