package com.github.irya_lis.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;

    private int age;

//        public Person() {
//            System.out.println("Person bean is created");
//    }


    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bea is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public Person(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(String age) {
    }
}
