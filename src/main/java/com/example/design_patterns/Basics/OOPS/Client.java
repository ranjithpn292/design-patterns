package com.example.design_patterns.Basics.OOPS;

public class Client {
    public static void main(String[] args){
      PaymentService ps = new PaymentService();
      ps.addPaymentMethod("RanjithCC", new CreditCard("1234", "Ranjith P N"));
      ps.addPaymentMethod("RanjithDC",new DebitCard("5678","Ranjith P N"));

      ps.makePaymentMethod("RanjithCC");
        ps.makePaymentMethod("RanjithDC");
    }
}
