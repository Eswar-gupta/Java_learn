package com.example.Spring_Demo_from_start_spring_io.models;

import com.example.Spring_Demo_from_start_spring_io.service.Desktopservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Allien{

    private int age;
    @Autowired
    @Qualifier("desktop") //deflaut bean name is first letter made small
    private Computer Comp;

    @Autowired
    public Desktopservice dts;
    public void code(){
        dts.isgooddesktop(Comp);
        System.out.println("I am coding bro");
        Comp.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Computer getComp(){
        return this.Comp;
    }

    public void setComp(Computer comp) {
        this.Comp = comp;
    }
}