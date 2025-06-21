package com.example.design_patterns.StructuralPatterns.DecoratorPattern.GoodCode;

public class OliveDecorator extends PizzaDecorator{

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription(){
        return decoratedPizza.getDescription()+", Olive";
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost()+2.0;
    }
}
