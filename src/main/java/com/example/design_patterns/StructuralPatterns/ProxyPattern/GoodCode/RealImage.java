package com.example.design_patterns.StructuralPatterns.ProxyPattern.GoodCode;

public class RealImage implements Image {

    private String filename;


    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk();  // Expensive operation
    }

    private void loadImageFromDisk() {
        System.out.println("Loading Image from disk  ::" + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying  ::" + filename);
    }
}
