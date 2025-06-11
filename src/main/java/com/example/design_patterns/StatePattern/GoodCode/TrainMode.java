package com.example.design_patterns.StatePattern.GoodCode;

public class TrainMode implements TransportStatePattern{
    @Override
    public int getETA() {
        System.out.println("calculating ETA for (Train)");
        return 10;
    }

    @Override
    public String getDirections() {
        return "Directions for Train";
    }
}
