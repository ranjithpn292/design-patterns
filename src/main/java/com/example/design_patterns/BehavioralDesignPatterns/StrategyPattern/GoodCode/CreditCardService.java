package com.example.design_patterns.BehavioralDesignPatterns.StrategyPattern.GoodCode;

public class CreditCardService implements PaymentStrategy{
    @Override
    public void processPayment(String amount) {
        System.out.println("payment made via Credit card  $" + amount);
    }
}
