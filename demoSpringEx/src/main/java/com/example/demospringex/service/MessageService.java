package com.example.demospringex.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public void sendMessage() {
        System.out.println("Привет, Spring!");
    }
}
