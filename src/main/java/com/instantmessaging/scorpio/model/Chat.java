package com.instantmessaging.scorpio.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chat implements Serializable {
    
    private String chatId;
    private String senderId;
    private String receiverId;
    private String message;
    private long timestamp;
    private boolean isRead;
    private String chatType; // e.g., "text", "image", "video"
    private String status; // e.g., "sent", "delivered", "read
}
