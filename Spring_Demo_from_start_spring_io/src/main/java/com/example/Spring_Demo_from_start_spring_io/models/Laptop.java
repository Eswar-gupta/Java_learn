package com.example.Spring_Demo_from_start_spring_io.models;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("Compliling on laptop");
    }
}
