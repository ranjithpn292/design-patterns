package com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.GoodCode;

import com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.Bike;
import com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.Car;
import com.example.design_patterns.StructuralPatterns.FactoryDesignPattern.Transport;

public class TransportService {
    public static Transport createTransport(String type){
        switch(type.toLowerCase()){
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("unsupported vehicle");
        }
    }
}
