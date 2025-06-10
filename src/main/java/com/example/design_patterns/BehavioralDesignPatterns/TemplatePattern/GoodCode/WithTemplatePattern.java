package com.example.design_patterns.BehavioralDesignPatterns.TemplatePattern.GoodCode;


abstract class DataParser{
  // template method defining steps of the algorithm

    public void parse(){
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("opening file in TemplatePattern");
    }

    protected void closeFile(){
        System.out.println("closing file in TemplatePattern");
    }

    protected abstract void parseData();
}

class CSVParser extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("parsing data in CSV TemplatePattern");
    }

}

class JSONParser extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("parsing data in JSON TemplatePattern");
    }

}



public class WithTemplatePattern {
    public static void main(String[] args){
      DataParser csvParser = new CSVParser();
      DataParser jsonParser = new JSONParser();
      csvParser.parse();
      jsonParser.parse();
    }
}
