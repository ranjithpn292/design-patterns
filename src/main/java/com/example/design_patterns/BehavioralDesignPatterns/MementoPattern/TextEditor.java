package com.example.design_patterns.BehavioralDesignPatterns.MementoPattern;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextEditor {
    private String content;

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    // update state of current content
    public void restore(EditorMemento memento){
        content = memento.getContent();
    }


}
