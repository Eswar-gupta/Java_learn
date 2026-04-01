package org.example;

import org.springframework.stereotype.Component;

@Component
public class Destop implements Computer {
    @Override
    public void complie(){
        System.out.println("Compling from Desktop");
    }
}
