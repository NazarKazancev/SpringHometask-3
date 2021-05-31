package com.example.hometask;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!dev")
public class ProdSmsSender implements SmsSender {
    @Override
    public void send(String phoneNumber, String text) {

    }
}
