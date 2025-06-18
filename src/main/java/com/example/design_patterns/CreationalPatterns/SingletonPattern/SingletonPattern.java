package com.example.design_patterns.CreationalPatterns.SingletonPattern;

public class SingletonPattern {

    public static void main(String[] args){

        AppSettings appSettings1 = AppSettings.getInstance();
        AppSettings appSettings2 = AppSettings.getInstance();

        System.out.println(appSettings1.equals(appSettings2));
    }

}
