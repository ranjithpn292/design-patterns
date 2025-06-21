package com.example.design_patterns.StructuralPatterns.FlyweightPattern.BadCode;

public class Bullet {
    private String color;  // intrinsic property, shared common by all
    private int x,y;  // extrinsic property, unique for each obj
    private int velocity;  // extrinsic property

    public Bullet(String color, int x, int y, int velocity){
        this.color = color;
        this.x=x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("creating bullet at x:"+x+",y:"+y+", with velocity:"+velocity+" of color: "+ color);
    }
}
