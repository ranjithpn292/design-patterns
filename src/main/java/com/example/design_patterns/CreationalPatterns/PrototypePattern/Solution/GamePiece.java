package com.example.design_patterns.CreationalPatterns.PrototypePattern.Solution;

import lombok.Setter;

public class GamePiece implements Prototype<GamePiece> {

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

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.position);
    }
}
