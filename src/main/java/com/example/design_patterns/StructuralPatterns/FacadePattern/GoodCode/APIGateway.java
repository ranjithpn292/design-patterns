package com.example.design_patterns.StructuralPatterns.FacadePattern.GoodCode;

public class APIGateway {

    UserService userService;
    OrderService orderService;
    PaymentsService paymentService;

    APIGateway(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentsService();
    }

    public String gettFullOrderDetails(String name, String item, String price){
        String user = userService.getUserDetails(name);
        String items = orderService.getOrderDetails(item);
        String cost = paymentService.processPayment(price);

        return user + items + cost;
    }

}
