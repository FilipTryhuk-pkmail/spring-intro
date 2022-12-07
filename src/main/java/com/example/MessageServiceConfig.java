package com.example;

import org.springframework.context.annotation.*;

@Configuration
public class MessageServiceConfig{
    @Bean
    public RandomTextMessageService messageService(){
        return new RandomTextMessageService();
    }

    @Bean
    public MyNameMessageService secondMessageService(){
        return new MyNameMessageService();
    }
}
