package com.example.design_patterns.CreationalPatterns.PrototypePattern.Problem;

public class GameClientWithoutPrototypePattern {

    public static void main(String[] args){
        GameBoard gameBoard = new GameBoard();

        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Blue", 2));

        gameBoard.showBoard();
    }
}
