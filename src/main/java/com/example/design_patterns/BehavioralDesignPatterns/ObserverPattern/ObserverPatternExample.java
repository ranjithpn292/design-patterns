package com.example.design_patterns.BehavioralDesignPatterns.ObserverPattern;


import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer{
    void update(float temp);
}

// Subject interface
interface Subject{
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}

class WeatherStatn implements Subject{

    private float temparature;
    private List<Observer> observerList;

    WeatherStatn(){
      observerList = new ArrayList<>()
;    }

    @Override
    public void attach(Observer obs) {
       observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
      observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
       for(Observer obs: observerList){
           obs.update(temparature);
       }
    }

    public void setTemparature(float temp){
        this.temparature = temp;
        notifyObservers();
    }
}

class DisplayDeviceIn implements Observer{
    String name;

    DisplayDeviceIn(String name){
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("temparature on Display::"+temp);
    }
}

class MobileDevice implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("temparature on Mobile::"+temp);
    }
}


public class ObserverPatternExample {

    public static void main(String[] args){

        // create a publisher
        WeatherStatn weatherStatn = new WeatherStatn();

        // create a subscriber
        DisplayDeviceIn displayDeviceIn = new DisplayDeviceIn("VIVO");
        MobileDevice mobileDevice = new MobileDevice();
        weatherStatn.attach(displayDeviceIn);
        weatherStatn.attach(mobileDevice);

        weatherStatn.setTemparature(25);
        weatherStatn.setTemparature(30);

    }
}
