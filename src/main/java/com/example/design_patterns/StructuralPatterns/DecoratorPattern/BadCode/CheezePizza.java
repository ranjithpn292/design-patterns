package com.example.design_patterns.StructuralPatterns.DecoratorPattern.BadCode;

public class CheezePizza extends BasicPizza{
    @Override
    public String getDescription() {
        return super.getDescription() + ",Cheeze";
    }

    @Override
    public double getCost() {
        return super.getCost()+10.0;
    }
}
