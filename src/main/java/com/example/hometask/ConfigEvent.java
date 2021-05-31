package com.example.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

public class ConfigEvent extends ApplicationEvent {
    private static SimpleConfig simpleConfig;
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ConfigEvent(Object source, SimpleConfig config) {
        super(source);
        simpleConfig = config;
    }

    public SimpleConfig getSimpleConfig() {
        return simpleConfig;
    }
}
