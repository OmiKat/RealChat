package com.example.RealTImeChat.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNullApi;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    //as the name says it tells abt the endpoints
    //we are adding endpoints where the stomp will be used
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .setAllowedOrigins("http://localhost:8008")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // this is like a broadcast channel (the person sub will receive msgs)
        registry.setApplicationDestinationPrefixes("/app"); //this is telling the broker to process the request from this endpoint
    }
}

