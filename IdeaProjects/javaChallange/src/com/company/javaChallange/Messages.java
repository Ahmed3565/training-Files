package com.company.javaChallange;

import java.util.ArrayList;

public class Messages {
    private final ArrayList<String> messageSender = new ArrayList<>();
    private final ArrayList<String> message = new ArrayList<>();

    public void sendMessage (String name , String message) {
        messageSender.add(name);
        this.message.add(message);
        System.out.println("the message sent successfully.\n");
    }

    public void getAllMessages () {
        if (messageSender.size() != 0) {
            for (int i = 0; i < messageSender.size(); i++) {
                System.out.printf("Name: %s\nMessage: %s\n", messageSender.get(i), message.get(i));
            }
        } else {
            System.out.println("...no messages...");
        }
    }
}
