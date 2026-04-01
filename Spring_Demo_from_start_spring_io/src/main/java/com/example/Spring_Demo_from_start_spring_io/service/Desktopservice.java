package com.example.Spring_Demo_from_start_spring_io.service;

import com.example.Spring_Demo_from_start_spring_io.models.Computer;
import org.springframework.stereotype.Service;

@Service
public class Desktopservice {
    public boolean isgooddesktop(Computer Comp){
        System.out.println("Desktop is good");
        return true;
    }
}
