package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext messageServiceConfig = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = messageServiceConfig.getBean(MyNameMessageService.class);
        MessageService secondMessageService = messageServiceConfig.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(secondMessageService.getMessage());
        System.out.println();

        System.out.println(System.identityHashCode(messageService));
        System.out.println(System.identityHashCode(secondMessageService));
    }
}
