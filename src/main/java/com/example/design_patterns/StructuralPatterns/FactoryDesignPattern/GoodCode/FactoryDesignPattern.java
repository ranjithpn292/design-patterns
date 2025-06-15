package com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.GoodCode;

import com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.Transport;

public class FactoryDesignPattern {


        public static void main(String[] args){
            Transport car = TransportService.createTransport("car");
            Transport bike = TransportService.createTransport("bike");
            car.deliver();
            bike.deliver();
        }

}
