package com.example.demospringex.repo;

import com.example.demospringex.service.MessageService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@Repository
public class MessagePrinter {

    private MessageService messageService;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }
}
