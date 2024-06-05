package com.github.irya_lis.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);

        System.out.println("Переменные cat1 и cat2 ссылаются на один и тот же объект?: "  + (cat1 == cat2));

        Person person1 = context.getBean("personBean", Person.class);
        Person person2 = context.getBean("personBean", Person.class);

        System.out.println("Переменные person1 и person2 ссылаются на один и тот же объект?: "  + (person1 == person2));

        person1.callYourPet();

        context.close();
    }
}
