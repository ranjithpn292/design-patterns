package com.example.design_patterns.StructuralPatterns.FactoryDesignPattern;

public class Car implements  Transport{

    @Override
    public void deliver() {
        System.out.println("deliver by car!!");
    }
}
