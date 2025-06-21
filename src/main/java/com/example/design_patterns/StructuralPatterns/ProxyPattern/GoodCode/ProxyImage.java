package com.example.design_patterns.StructuralPatterns.ProxyPattern.GoodCode;

public class ProxyImage implements Image{

    private String filename;

    private RealImage realImage;

    public ProxyImage(String filename){
        this.filename = filename;
    }


    @Override
    public void display() {

        if(realImage == null){
            realImage = new RealImage(filename);  // image is loaded and cached
        }
        realImage.display();
    }
}
