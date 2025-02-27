package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService secondMessageService = applicationContext.getBean("secondMessageService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(secondMessageService.getMessage());
        System.out.println();

        System.out.println(System.identityHashCode(messageService));
        System.out.println(System.identityHashCode(secondMessageService));
        applicationContext.close();
    }
}
