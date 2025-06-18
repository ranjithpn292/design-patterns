package com.example.design_patterns.CreationalPatterns.BuilderPattern.GoodCode;


public class WithBilderPattern {
    public static void main(String[] args){
        House newHouse = new House.HouseBuilder("stoness", "cubess","tiles").setHasSwimmingPool(true).build();
        System.out.println(newHouse);
    }
}
