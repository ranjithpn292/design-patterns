package com.example.design_patterns.BehavioralDesignPatterns.StrategyPattern.GoodCode;

import com.example.design_patterns.Basics.OOPS.CreditCard;

public class DebitCardService implements PaymentStrategy{

    @Override
    public void processPayment(String amount) {
        System.out.println("payment made via Debit card");
    }
}
