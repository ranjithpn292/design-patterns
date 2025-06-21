package com.example.design_patterns.StructuralPatterns.ProxyPattern.GoodCode;

public class Client {

    public static void main(String[] args){
        Image image1 = new ProxyImage("dog.png");
        Image image2 = new ProxyImage("dog.png");

        image1.display();
        image1.display();

    }
}
