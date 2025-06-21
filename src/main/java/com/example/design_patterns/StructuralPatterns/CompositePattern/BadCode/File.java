package com.example.design_patterns.StructuralPatterns.CompositePattern.BadCode;

public class File {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("File ::" + name);
    }


}
