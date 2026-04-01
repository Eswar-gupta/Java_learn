package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alliean {
    @Autowired
    @Qualifier("my_com")
    public Computer comp;
    Alliean(){}// Just deflaut constructor
    Alliean(Computer comp){
        this.comp = comp;
    }
    public void setComp(Computer comp){
        this.comp = comp;
    }
    public void code_n_complie(){
        System.out.println("Hello I am coding");
        comp.complie();
    }
}