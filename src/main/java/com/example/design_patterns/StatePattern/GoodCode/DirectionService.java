package com.example.design_patterns.StatePattern.GoodCode;
import lombok.Setter;

public class DirectionService {

    @Setter
    private TransportStatePattern transportStatePattern;

    DirectionService(TransportStatePattern transportStatePattern){
        this.transportStatePattern = transportStatePattern;
    }

    public int getETA(){
        return transportStatePattern.getETA();
    }

    public String getDirections(){
       return transportStatePattern.getDirections();
    }
}