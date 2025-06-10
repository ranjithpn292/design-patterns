package com.example.design_patterns.BehavioralDesignPatterns.TemplatePattern;

 class CSVParser{
     public void parse(){
         openFile();
         System.out.println("CSV Parsing logic");
         closeFile();
     }

     public void openFile(){
         System.out.println("opening CSV file");
     }

     public void closeFile(){
         System.out.println("closing CSV file");
     }
}

class JSONParser{
    public void parse(){
        openFile();
        System.out.println("JSON Parsing logic");
        closeFile();
    }

    public void openFile(){
        System.out.println("opening JSON file");
    }

    public void closeFile(){
        System.out.println("closing JSON file");
    }
}

public class WithoutTemplatePattern {
    public static void main(String[] args){
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
