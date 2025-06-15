package com.example.design_patterns.StructuralPatterns.SingletonPattern;

import lombok.Getter;
import lombok.Setter;

public class AppSettings {

   // to make an object singleton
    //1. create a private static instance
       private static AppSettings instance;
        @Getter
        @Setter
        private String databaseUrl;

        @Getter
        @Setter
        private String apiKey;

        //2. make constructor private
       private AppSettings(){
            databaseUrl = "jdbc:mysql://localhost:3306/mydatabase";
            apiKey = "1234-ABCD";
        }

        //3.create a ststic method getInstance method to craete an object of it
    public static AppSettings getInstance(){
           if(instance == null)
              instance = new AppSettings();
           return instance;
    }
    }

