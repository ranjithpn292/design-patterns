package com.example.design_patterns.BehavioralDesignPatterns.MediatorPattern;


import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


interface ChatMediator{
    void sendMessage(String message, ChatUser user);

    void addUser(ChatUser user);
}

class ChatRoom implements ChatMediator{

    private List<ChatUser> users;

    ChatRoom(){
       this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, ChatUser sender) {
       for(ChatUser u: users){
           if(!u.equals(sender))
           u.receiveMessage(message, sender);
       }
    }

    @Override
    public void addUser(ChatUser user) {
       users.add(user);
    }
}


class ChatUser {

    @Getter
    private String name;

    private ChatMediator chatMediator;

    ChatUser(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String message){
        chatMediator.sendMessage(message, this);
    }

    public void receiveMessage(String message, ChatUser sender){
        System.out.println(this.name+ " receiving message: '"+ message +"' from  " + sender.getName());
    }
}

public class WithMediatorPattern {
    public static void main(String[] args){
        ChatMediator chatRoom = new ChatRoom();
        ChatUser rahul = new ChatUser("rahul", chatRoom);
        ChatUser amit = new ChatUser("amith", chatRoom);
        ChatUser neha = new ChatUser("neha", chatRoom);


        chatRoom.addUser(rahul);
        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        neha.sendMessage("Hi ::");
    }
}
