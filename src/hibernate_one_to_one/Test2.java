package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {


//            Employee employee = new Employee("Iva", "Colin", "actor", 900);
//            Detail detail = new Detail("Frank", "8876555", "iva@gmail.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

            session = factory.getCurrentSession();

            session.beginTransaction();
            Detail detail = session.get(Detail.class, 3);
            System.out.println(detail.getEmployee());


            session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
