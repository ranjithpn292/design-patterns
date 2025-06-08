package com.example.design_patterns.Basics.OOPS;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
public class CreditCard extends Card{

    CreditCard(String name,String cardNo){
        super(name,cardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via CreditCard");
    }
}
