package com.kodilla.spring.forum;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;

    public ForumUser() {
        this.username = "John Smith";
    }
    @Bean
    public String getUsername() {
        return username;
    }
}
