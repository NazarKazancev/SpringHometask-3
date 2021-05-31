package com.example.hometask;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevSmsSender implements SmsSender{
    @Override
    public void send(String phoneNumber, String text) {
        System.out.println("DEV: Sending "+ text + " \nTO " + phoneNumber);
    }
}
