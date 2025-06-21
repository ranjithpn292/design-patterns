package com.example.design_patterns.StructuralPatterns.CompositePattern.GoodCode;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> files = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void addFile(FileSystemComponent file){
        files.add(file);
    }

    public void showDetails(){
        System.out.println("Folder::" + name);
        for(FileSystemComponent file: files){
            file.showDetails();
        }
    }
}
