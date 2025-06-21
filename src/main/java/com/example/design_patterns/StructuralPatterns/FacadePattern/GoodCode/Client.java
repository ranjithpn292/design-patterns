package com.example.design_patterns.StructuralPatterns.FacadePattern.GoodCode;


public class Client {
    public static void main(String[] args) {
          APIGateway apiGateway = new APIGateway();
          System.out.println(apiGateway.gettFullOrderDetails(":ram", "biryanu", "4.0"));
    }
}
