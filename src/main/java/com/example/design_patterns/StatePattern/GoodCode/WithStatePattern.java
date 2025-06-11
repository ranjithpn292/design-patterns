package com.example.design_patterns.StatePattern.GoodCode;

public class WithStatePattern {

    public static void main(String[] args){
        DirectionService directionService = new DirectionService(new CarMode());
        directionService.getETA();
        System.out.println(directionService.getDirections());
    }

}
