package com.example.hometask;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigEventListener implements ApplicationListener<ConfigEvent> {
    @Override
    public void onApplicationEvent(ConfigEvent event) {
        System.out.println(event.getSimpleConfig().getFirstConfig());
        System.out.println(event.getSimpleConfig().getSecondConfig());
    }
}
