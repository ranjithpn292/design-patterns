package com.example.design_patterns.StructuralPatterns.FacadePattern.BadCode;

public class OrderService {

    public String getOrderDetails(String orderId){
        return "Order details ::" + orderId;
    }
}
