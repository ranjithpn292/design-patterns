package com.example.design_patterns.CreationalPatterns.FactoryDesignPattern.GoodCode;

import com.example.design_patterns.CreationalPatterns.FactoryDesignPattern.Transport;

public class FactoryDesignPattern {


        public static void main(String[] args){
            Transport car = TransportService.createTransport("car");
            Transport bike = TransportService.createTransport("bike");
            car.deliver();
            bike.deliver();
        }

}
