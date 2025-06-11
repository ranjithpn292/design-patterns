package com.example.design_patterns.StatePattern.BadCode;

import lombok.Setter;

enum TransportationMode{
    WALKING, CYCLING, CAR , TRAIN;
}

public class DirectionService {

    @Setter
    private TransportationMode mode;

    DirectionService(TransportationMode mode){
        this.mode = mode;
    }

    public void getETA(){
        switch(mode){
            case WALKING:
                System.out.println("calculating ETA for walking");
                return;
            case CYCLING:
                System.out.println("calculating ETA for cycling");
                return;
            case CAR:
                System.out.println("calculating ETA for car");
                return;
            case TRAIN:
                System.out.println("calculating ETA for train");
                return;

            default:
                throw new IllegalArgumentException("no ETA available");
        }
    }

    public void getDirections(){
        switch(mode){
            case WALKING:
                System.out.println("calculating directions for walking");
                return;
            case CYCLING:
                System.out.println("calculating directions for cycling");
                return;
            case CAR:
                System.out.println("calculating directions for car");
                return;
            case TRAIN:
                System.out.println("calculating directions for train");
                return;
            default:
                throw new IllegalArgumentException("no directions available");
        }
    }
}
