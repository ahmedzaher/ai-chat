package com.example.controller;

import com.example.factory.ChatClientFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.enums.ChatClientType.OLLAMA;
import static com.example.enums.ChatClientType.OPEN_AI;

@RestController
@RequiredArgsConstructor
@RequestMapping("chat")
public class ChatController {

    private final ChatClientFactory clientFactory;

    @GetMapping("openai")
    public String chatOpenAi(String message) {
        return clientFactory.getClient(OPEN_AI.getClientName()).prompt(message).call().content();
    }

    @GetMapping("ollama")
    public String chatOllama(String message) {
        return clientFactory.getClient(OLLAMA.getClientName()).prompt(message).call().content();
    }


}
