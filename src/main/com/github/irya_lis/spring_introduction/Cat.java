package com.github.irya_lis.spring_introduction;

public class Cat extends AbstractPet {


    @Override
    public void say() {
        System.out.println( " say " + "Meeo-meeeo");
    }
}