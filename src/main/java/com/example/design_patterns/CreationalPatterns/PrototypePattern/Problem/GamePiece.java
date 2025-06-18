package com.example.design_patterns.CreationalPatterns.PrototypePattern.Problem;

import lombok.Setter;

public class GamePiece {

    @Setter
    private String color;

    @Setter
    private int position;

    public GamePiece(String color, int position){
        this.color = color;
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
