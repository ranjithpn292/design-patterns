package com.example.design_patterns.CreationalPatterns.FactoryDesignPattern;


public class Bike implements  Transport{

    @Override
    public void deliver() {
        System.out.println("deliver by bike!!");
    }
}
