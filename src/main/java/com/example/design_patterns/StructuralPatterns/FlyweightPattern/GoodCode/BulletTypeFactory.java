package com.example.design_patterns.StructuralPatterns.FlyweightPattern.GoodCode;

import java.util.HashMap;

public class BulletTypeFactory {
    private static final HashMap<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color){
        if(!bulletTypes.containsKey(color)){
           bulletTypes.put(color, new BulletType(color));
        }
        return bulletTypes.get(color);
    }
}
