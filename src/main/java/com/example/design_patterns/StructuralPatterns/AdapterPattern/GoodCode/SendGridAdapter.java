package com.example.design_patterns.StructuralPatterns.AdapterPattern.GoodCode;

import com.example.design_patterns.StructuralPatterns.AdapterPattern.BadCode.NotificationService;

public class SendGridAdapter implements NotificationService {

    SendGridService sendGridService;

    public SendGridAdapter(SendGridService sendGridService){
        this.sendGridService = sendGridService;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridService.sendGridEmail(to,subject,body);
    }
}
