package com.github.irya_lis.spring_introduction;

public class TestDog {
    public static void main(String[] args) {
        Pet pet = new Dog();
        AbstractPet abstractPet = new Dog();
        pet.say();
        abstractPet.say();
    }


}
