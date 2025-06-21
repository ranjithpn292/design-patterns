package com.example.design_patterns.StructuralPatterns.FlyweightPattern.GoodCode;

public class Bullet {


    private BulletType type;

    private int x,y;  // extrinsic property, unique for each obj
    private int velocity;  // extrinsic property

    public Bullet(String color, int x, int y, int velocity){
        this.type = BulletTypeFactory.getBulletType(color);
        this.x=x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("creating bullet at x:"+x+",y:"+y+", with velocity:"+velocity+" of color: "+ color);
    }
}
