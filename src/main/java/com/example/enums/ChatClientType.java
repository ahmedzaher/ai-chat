package com.example.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ChatClientType {
    OPEN_AI("openAiClient"),
    OLLAMA("ollamaAiClient"),
    ;

    private final String clientName;
}
