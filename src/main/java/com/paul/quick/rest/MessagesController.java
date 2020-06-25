package com.paul.quick.rest;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Getter
    @RequiredArgsConstructor
    class Message {
        private final int id;
        private final String message;
    }

    @GetMapping("")
    public List<Message> getMessages() {
        return new ArrayList<Message>(
                Arrays.asList(new Message(1, "Hello Java World"),
                        new Message(2, "Happy Smiling People"))
        );
    }
 }
