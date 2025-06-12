package com.example.design_patterns.BehavioralDesignPatterns.MediatorPattern;


import lombok.Getter;

class User {

    @Getter
    private String name;

    User(String name){
        this.name = name;
    }

    public void sendMessage(String message, User recipent){
        System.out.println(this.name + " sending message: " +message+ "to " + recipent.getName());
    }
}

public class WithoutMediatorPattern {
    public static void main(String[] args){

        User rahul = new User("rahul");
        User amit = new User("amith");
        User neha = new User("neha");

        rahul.sendMessage("Hello ", amit);
        rahul.sendMessage("Hi ",neha);

    }
}
