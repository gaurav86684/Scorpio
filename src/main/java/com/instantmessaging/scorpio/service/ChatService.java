package com.instantmessaging.scorpio.service;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class ChatService {
    
    public void sendMessage(String message) {
        log.info("Sending message: {}", message);
    }
}