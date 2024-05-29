package com.github.irya_lis.spring_introduction;

public class Test_dog {
    public static void main(String[] args) {
        Pet pet = new Dog("Dana");
        AbstractPet abstractPet = new Dog("d");
        pet.say();
        abstractPet.say();
    }


}
