package com.chat.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

}
