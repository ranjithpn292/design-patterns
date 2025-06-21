package com.example.design_patterns.StructuralPatterns.CompositePattern.GoodCode;

public class FileSystemApp {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");

        Folder folder = new Folder("Documents");
        folder.addFile(file1);
        folder.addFile(file2);
        Folder subFoolder = new Folder("SubFolder");
        FileSystemComponent file3 = new File("file1.txt");
        FileSystemComponent file4 = new File("file2.txt");
        subFoolder.addFile(file3);
        subFoolder.addFile(file4);
        folder.addFile(subFoolder);
        folder.showDetails();
    }
}
