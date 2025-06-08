package com.example.design_patterns.Basics.OOPS;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DebitCard extends Card{

    DebitCard(String name,String cardNo){
        super(name,cardNo);
    }

    @Override
    public void pay() {
        System.out.println("Making payment via DebitCard");
    }
}
