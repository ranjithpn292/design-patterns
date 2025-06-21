package com.example.design_patterns.StructuralPatterns.FacadePattern.BadCode;

public class PaymentsService {

    public String processPayment(String paymentId){
        return "processing the payment ::" + paymentId;
    }
}
