package com.github.irya_lis.spring_introduction;

public class Dog extends AbstractPet {


    public Dog(String name) {
        super(name);
    }


    @Override
    public void say() {
        System.out.println(this.getName() + " say " +  "Waff-waff");
    }
}
