package com.example.design_patterns.StructuralPatterns.AdapterPattern.BadCode;

// Legacy code : Email Notification Service

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String to, String subject, String body){

        System.out.println("Sending to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);

    }
}
