package com.example.design_patterns.BehavioralDesignPatterns.ObserverPattern;

import lombok.Setter;

class DisplayDevice{

    public void showTemparature(float temp){
        System.out.println("temparature is: "+ temp + " C");
    }
}

class WeatherStation{

    private float temparature;
    private DisplayDevice displayDevice;

    public WeatherStation(DisplayDevice displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemparature(float temp){
        temparature = temp;
        notifyDevice();
    }

    public void notifyDevice(){
        displayDevice.showTemparature(temparature);
    }

}
public class WithoutObserverPattern {

    public static void main(String[] args){
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation station = new WeatherStation(displayDevice);

        station.setTemparature(26);
        station.setTemparature(30);
    }
}
