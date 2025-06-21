package com.example.design_patterns.StructuralPatterns.CompositePattern.GoodCode;

public class File implements FileSystemComponent {
    private String name;

    public File(String name){
        this.name = name;
    }

    public void showDetails(){
        System.out.println("File ::" + name);
    }


}
