package com.example.design_patterns.StructuralPatterns.PrototypePattern.Solution;

public class GameClientWithPrototypePattern {

    public static void main(String[] args){
        GameBoard gameBoard = new GameBoard();

        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 2));

        gameBoard.showBoard();

        GameBoard copiedBoard = gameBoard.clone();

        System.out.print("Copied Board");
        copiedBoard.showBoard();
    }
}
