package com.github.irya_lis.spring_introduction;

import org.springframework.stereotype.Component;

@Component("cat")

public class Cat extends AbstractPet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println( " say " + "Meeo-meeeo");
    }
}