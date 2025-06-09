package com.example.design_patterns.BehavioralDesignPatterns.StrategyPattern.GoodCode;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.processPayment("100");
    }

}

class Main{
    public static void main(String[] args){
        PaymentService paymentService = new PaymentService(new CreditCardService());
        paymentService.pay();
    }
}
