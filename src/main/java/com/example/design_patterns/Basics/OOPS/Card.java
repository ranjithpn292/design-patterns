package com.example.design_patterns.Basics.OOPS;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
abstract public class Card implements PaymentMethod{

    private String cardNo;
    private String userName;
}
