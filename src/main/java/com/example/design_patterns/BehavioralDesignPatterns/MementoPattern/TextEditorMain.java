package com.example.design_patterns.BehavioralDesignPatterns.MementoPattern;

public class TextEditorMain {

    public static void main(String[] args){
        History history = new History();
        TextEditor textEditor = new TextEditor();
        textEditor.setContent("Hello World!");
        history.saveState(textEditor);
        textEditor.setContent("Hello Everyone!");
        history.saveState(textEditor);

        history.undo(textEditor);
        System.out.println(textEditor.getContent());

    }
}
