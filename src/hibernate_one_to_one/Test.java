package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Sam", "Win", "actor", 200);
//            Detail detail = new Detail("Canada", "12345", "win@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();


//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Ivanov", "actor", 400);
//            Detail detail = new Detail("Russia", "1433345", "iva@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);


            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
