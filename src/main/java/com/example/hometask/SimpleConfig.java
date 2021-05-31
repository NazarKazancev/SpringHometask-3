package com.example.hometask;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;


@ConstructorBinding
@ConfigurationProperties(prefix = "app")
public class SimpleConfig {
    private final String firstConfig;
    private final SecondConfig secondConfig;

    public SimpleConfig(String firstConfig, SecondConfig secondConfig) {
        this.firstConfig = firstConfig;
        this.secondConfig = secondConfig;
    }

    public String getFirstConfig() {
        return firstConfig;
    }

    public SecondConfig getSecondConfig() {
        return secondConfig;
    }

    public static class SecondConfig {
        String subConfig;
        String user;
        String ttl;

        public SecondConfig(String subConfig, String user, String ttl) {
            this.subConfig = subConfig;
            this.user = user;
            this.ttl = ttl;
        }

        @Override
        public String toString() {
            return subConfig + " " + user + " " + ttl;
        }

        public String getSubConfig() {
            return subConfig;
        }

        public String getUser() {
            return user;
        }

        public String getTtl() {
            return ttl;
        }
    }
}
