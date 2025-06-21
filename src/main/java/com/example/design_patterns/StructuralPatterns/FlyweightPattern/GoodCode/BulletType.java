package com.example.design_patterns.StructuralPatterns.FlyweightPattern.GoodCode;

// flyweight class
public class BulletType {

    private String color;  // intrinsic property, shared common by all

    public BulletType(String color){
        this.color = color;
        System.out.println("Creating bullet with color:" + color);
    }
}
