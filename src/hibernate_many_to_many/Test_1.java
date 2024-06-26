package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Child child1 = new Child("Daneliya", 3);
//            Child child2 = new Child("Daniyar", 2);
//            Child child3 = new Child("Amina", 6);
//            Child child4 = new Child("Airat", 10);
//
//            Section section1 = new Section("Music");
//            Section section2 = new Section("Dance");
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child3);
//
//            section2.addChildToSection(child2);
//            section2.addChildToSection(child4);
//
//
//            session.beginTransaction();
//
//            session.save(section1);
//            session.save(section2);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            ***********************************


            session = factory.getCurrentSession();
            Section section3 = new Section("Football");
            Section section4 = new Section("Run");
            Section section5 = new Section("Jump");

            Child child5 = new Child("Daneliya", 3);




            session.beginTransaction();
            session.save(child5);

            child5.addSectionToChild(section3);
            child5.addSectionToChild(section4);
            child5.addSectionToChild(section5);


            session.save(section3);
            session.save(section4);
            session.save(section5);

            session.getTransaction().commit();
            System.out.println("Done!");


//            ***************************************


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 4);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            ****************************************


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//            session.remove(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
