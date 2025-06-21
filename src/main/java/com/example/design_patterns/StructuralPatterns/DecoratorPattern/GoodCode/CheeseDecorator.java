package com.example.design_patterns.StructuralPatterns.DecoratorPattern.GoodCode;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription(){
        return decoratedPizza.getDescription()+", Cheese";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+1.0;
    }
}
