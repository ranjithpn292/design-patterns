package com.example.design_patterns.StructuralPatterns.DecoratorPattern.GoodCode;

import com.example.design_patterns.StructuralPatterns.DecoratorPattern.GoodCode.Pizza;

public class BasicPizza implements Pizza {


    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
