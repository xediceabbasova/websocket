package com.khadija.chat.dto;

import lombok.Builder;

@Builder
public record ChatMessage(
        String content,
        String sender,
        MessageType type
) {
}
