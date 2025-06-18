package com.example.design_patterns.CreationalPatterns.FactoryDesignPattern;

public class BadCode {

    public static void main(String[] args){
        Transport car = new Car();
        Transport bike = new Bike();
        car.deliver();
        bike.deliver();
    }
}
