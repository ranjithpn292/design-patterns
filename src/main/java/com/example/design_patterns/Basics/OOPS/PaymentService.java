package com.example.design_patterns.Basics.OOPS;

import java.util.HashMap;

public class PaymentService {
    HashMap<String,PaymentMethod> pm;
    PaymentService(){
        pm = new HashMap<>();
    }

    void addPaymentMethod(String name,PaymentMethod paymentMethod){
        pm.put(name,paymentMethod);
    }

    void makePaymentMethod(String name){
        PaymentMethod paymentMethod = pm.get(name);
        paymentMethod.pay();
    }
}
