package com.example.design_patterns.BehavioralDesignPatterns.StatePattern.GoodCode;

public class CarMode implements TransportStatePattern{
    @Override
    public int getETA() {
        System.out.println("calculating ETA for (Car)");
        return 10;
    }

    @Override
    public String getDirections() {
        return "Directions for Car";
    }
}
