package com.example.design_patterns.BehavioralDesignPatterns.CommandPattern;

class TextEditor{
    public void boldText(){
        System.out.println("text has been bolded");
    }

    public void ItalicText(){
        System.out.println("text has been Italisized");
    }

    public void UnderlineText(){
        System.out.println("text has been underlined");
    }
}

class BoldButton{
    private final TextEditor editor;
    BoldButton(TextEditor editor){
        this.editor = editor;
    }

    public void click(){
        editor.boldText();
    }
}

public class WithoutCommandPattern {
    public static void main(String[] args){
       BoldButton boldButton = new BoldButton(new TextEditor());
       boldButton.click();
    }
}
