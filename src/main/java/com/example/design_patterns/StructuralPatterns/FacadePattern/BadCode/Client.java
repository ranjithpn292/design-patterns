package com.example.design_patterns.StructuralPatterns.FacadePattern.BadCode;



public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentsService paymentService = new PaymentsService();

        // Tasks
        System.out.println(userService.getUserDetails("ram"));
        System.out.println(orderService.getOrderDetails("biryani"));
        System.out.println(paymentService.processPayment("5.0"));
    }
}
