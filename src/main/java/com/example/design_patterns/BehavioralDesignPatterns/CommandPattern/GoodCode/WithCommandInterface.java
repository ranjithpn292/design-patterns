package com.example.design_patterns.BehavioralDesignPatterns.CommandPattern.GoodCode;

import lombok.Setter;

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

class Button{

    @Setter
    private Command command;

    public void click(){
        command.execute();
    }
}




interface Command{
    void execute();
}

class BoldCommand implements Command{
    TextEditor textEditor;

    BoldCommand(TextEditor textEditor){
       this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.boldText();
    }
}

class ItalicCommand implements Command{
    TextEditor textEditor;

    ItalicCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.ItalicText();
    }
}

class UnderlineCommand implements Command{

    TextEditor textEditor;

    UnderlineCommand(TextEditor textEditor){
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.UnderlineText();
    }
}


public class WithCommandInterface {
    public static void main(String[] args){
        Button button = new Button();
        button.setCommand(new BoldCommand(new TextEditor()));
        button.setCommand(new ItalicCommand(new TextEditor()));
        button.click();
    }
}

