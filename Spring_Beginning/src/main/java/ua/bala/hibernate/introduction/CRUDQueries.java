package ua.bala.hibernate.introduction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.bala.hibernate.introduction.entity.Employee;

import java.util.List;

public class CRUDQueries {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    }

    private static void saveMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();
            Employee epm = new Employee("Sergei", "Ivanov", "HR", 750);
            session.beginTransaction();
            session.save(epm);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void selectMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();
            Employee epm = new Employee("Tatyana", "Ivanova", "SEO", 600);
            session.beginTransaction();
            session.save(epm);
//            session.getTransaction().commit();

            int myId = epm.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            factory.close();
        }
    }

    private static void readByHqlMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> employees = session.createQuery("from Employee " +
                    "where name = 'Ihor' " +
                    "and salary > 650")
                .getResultList();

            for (Employee e: employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void updateMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(1500);
            session.createQuery("update Employee " +
                    "set salary = 1000 " +
                    "where name = 'Tatyana'")
                .executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void deleteMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 4);
//            session.delete(emp);
            session.createQuery("delete Employee " +
                "where name = 'Sergei'")
                .executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
