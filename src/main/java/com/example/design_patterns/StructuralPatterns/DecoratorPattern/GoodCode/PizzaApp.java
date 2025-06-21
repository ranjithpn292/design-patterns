package com.example.design_patterns.StructuralPatterns.DecoratorPattern.GoodCode;



public class PizzaApp {

    public static void main(String[] args){
       Pizza pizza = new BasicPizza();

       // Add cheese
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());


    }

}
