package ua.bala.hibernate.relation.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.bala.hibernate.relation.one_to_one.entity.Employee;
import ua.bala.hibernate.relation.one_to_one.entity.Detail;

public class OneToOneRelationQueries {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Detail.class)
            .buildSessionFactory();

        deleteBiDirMethod(factory);

    }

    private static void saveUniDirMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();

            Employee epm = new Employee("Tatyana", "Smirnova", "Sales", 750);
            Detail detail = new Detail("Kyiv", "+380123456789", "tatyana.smirnova@gmail.com");
            epm.setEmpDetail(detail);

            session.beginTransaction();
            session.save(epm);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void saveBiDirMethod(SessionFactory factory) {
        try {
            Session session = factory.getCurrentSession();

            Employee epm = new Employee("Michal", "Razin", "HR", 650);
            Detail detail = new Detail("Lviv", "+380123456789", "michal.razin@gmail.com");

            epm.setEmpDetail(detail);
            detail.setEmployee(epm);

            session.beginTransaction();
            session.save(epm);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void readUniDirMethod(SessionFactory factory) {
        try (Session session = factory.getCurrentSession();){
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);

            session.getTransaction().commit();

            System.out.println(employee);
            System.out.println(employee.getEmpDetail());

        } finally {
            factory.close();
        }
    }

    private static void readBiDirMethod(SessionFactory factory) {
        try (Session session = factory.getCurrentSession()){
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);

            session.getTransaction().commit();

            System.out.println(detail.getEmployee());
            System.out.println(detail);

        } finally {
            factory.close();
        }
    }

    private static void deleteUniDirMethod(SessionFactory factory) {
        try (Session session = factory.getCurrentSession()){
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 3);
            session.delete(emp);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void deleteBiDirMethod(SessionFactory factory) {
        try (Session session = factory.getCurrentSession()){
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
