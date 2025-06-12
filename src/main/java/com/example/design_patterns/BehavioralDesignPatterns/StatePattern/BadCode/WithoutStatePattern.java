package com.example.design_patterns.BehavioralDesignPatterns.StatePattern.BadCode;

public class WithoutStatePattern {
    public static void main(String[] args){
        DirectionService directionService = new DirectionService(TransportationMode.WALKING);
        directionService.getETA();
        directionService.getDirections();
    }
}
