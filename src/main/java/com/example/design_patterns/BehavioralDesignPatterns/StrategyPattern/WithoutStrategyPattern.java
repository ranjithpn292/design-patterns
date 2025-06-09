package com.example.design_patterns.BehavioralDesignPatterns.StrategyPattern;

class PaymentService{
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("creditCard")){
           System.out.println("payment made via Credit card");
        }
        if(paymentMethod.equals("debitCard")){
            System.out.println("payment made via Debit card");
        }
    }
}

public class WithoutStrategyPattern {

    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("debitCard");
    }

}
