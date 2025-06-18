package com.example.design_patterns.StructuralPatterns.AdapterPattern;

import com.example.design_patterns.StructuralPatterns.AdapterPattern.BadCode.EmailNotificationService;
import com.example.design_patterns.StructuralPatterns.AdapterPattern.BadCode.NotificationService;
import com.example.design_patterns.StructuralPatterns.AdapterPattern.GoodCode.SendGridAdapter;
import com.example.design_patterns.StructuralPatterns.AdapterPattern.GoodCode.SendGridService;

public class Client {

    public static void main(String[] args){
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@coding.com", "Order details","Order placed at $50");

        NotificationService sendGridService = new SendGridAdapter(new SendGridService());
        sendGridService.send("customer@coding.com", "Order details","Order placed at $50");
    }
}
