package org.example;

import org.springframework.stereotype.Component;

@Component("my_com")
public class Laptop implements Computer {
    static int num_laps = 0;
    Laptop(){
        num_laps+=1;
        System.out.println("Laptop is created");
    }
    @Override
    public void complie(){
        System.out.println("Compling from Laptop num_laps = "+num_laps);
    }
}
