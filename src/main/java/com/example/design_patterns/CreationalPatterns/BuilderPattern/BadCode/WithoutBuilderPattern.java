package com.example.design_patterns.CreationalPatterns.BuilderPattern.BadCode;

public class WithoutBuilderPattern {

    public static void main(String[] args){
       House newHouse = new House("stone", "cube", "wood", true, false, false);
       System.out.println(newHouse);
    }
}
