package com.example.design_patterns.StructuralPatterns.AdapterPattern.GoodCode;

public class SendGridService {

    public void sendGridEmail(String to, String title, String content){

        System.out.println("Sending to via SendGrid: " + to);
        System.out.println("title : " + title);
        System.out.println("content : " + content);

    }
}
