package com.example.design_patterns.StructuralPatterns.FacadePattern.GoodCode;

public class PaymentsService {

    public String processPayment(String paymentId){
        return "processing the payment ::" + paymentId;
    }
}
