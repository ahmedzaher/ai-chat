package com.example.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

import java.util.Map;

@RequiredArgsConstructor
@Component
public class ChatClientFactory {

    private final Map<String, ChatClient> clients;

    public ChatClient getClient(String clientName) {
        return clients.get(clientName);
    }
}
