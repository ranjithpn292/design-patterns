package com.example.design_patterns.StatePattern.BadCode;

public class WithoutStatePattern {
    public static void main(String[] args){
        DirectionService directionService = new DirectionService(TransportationMode.WALKING);
        directionService.getETA();
        directionService.getDirections();
    }
}
