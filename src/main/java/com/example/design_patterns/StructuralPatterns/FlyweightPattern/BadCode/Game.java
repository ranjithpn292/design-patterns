package com.example.design_patterns.StructuralPatterns.FlyweightPattern.BadCode;

public class Game {
    public static void main(String[] args) {
        // 5 red bullet objects
        for(int i = 0;i<5;i++){
            Bullet bullet = new Bullet("red", 10,10, 100);
        }
        // 5 green bullet objects
        for(int i = 0;i<5;i++){
            Bullet bullet = new Bullet("green", 20,20, 200);
        }

        // problems
        // Memory overhead: Every bullets stores redundant data like color
        // PErformance : it slows when many bullets are created
    }
}
