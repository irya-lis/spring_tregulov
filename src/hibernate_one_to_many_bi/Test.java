package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Department department = new Department("Actor", 3000, 9000);
//            Employee employee1 = new Employee("Vera", "Ivanova", 3000);
//            Employee employee2 = new Employee("Eva", "Andreeva", 5000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();

            Department department = session.get(Department.class, 1);

            System.out.println(department);
            System.out.println(department.getEmps());

            Employee employee = session.get(Employee.class, 1);

            System.out.println(employee);
            System.out.println(employee.getDepartment());



            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }
    }
}
