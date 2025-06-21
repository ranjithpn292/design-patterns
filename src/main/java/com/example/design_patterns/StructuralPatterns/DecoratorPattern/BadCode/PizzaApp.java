package com.example.design_patterns.StructuralPatterns.DecoratorPattern.BadCode;

public class PizzaApp {

    public static void main(String[] args){
        Pizza cheesePizza = new CheezePizza();
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getCost());
    }

}
