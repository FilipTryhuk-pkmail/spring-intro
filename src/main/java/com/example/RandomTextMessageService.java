package com.example;

import java.util.Random;

public class RandomTextMessageService implements MessageService {
    private final String[] messages = {"message 1", "sample 2", "random message 3", "mess. 4", "sent 5", "message 6/10", "Hello World", "msg 8", "9...", "last message"};
    @Override
    public String getMessage() {
        Random rand = new Random(System.currentTimeMillis());
        int roll = rand.nextInt(10);
        return messages[roll];
    }
}
