package com.example.RealTImeChat.model;


public class ChatMessage {
    private Long id;
    private String sender;
    private String content;

    public ChatMessage() {
    }

    public ChatMessage(String content, Long id, String sender) {
        this.content = content;
        this.id = id;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}
