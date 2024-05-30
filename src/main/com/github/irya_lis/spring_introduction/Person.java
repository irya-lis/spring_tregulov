package com.github.irya_lis.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

        public Person() {
            System.out.println("Person bean is created");
    }


    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
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



    public void setAge(String age) {
    }
}
