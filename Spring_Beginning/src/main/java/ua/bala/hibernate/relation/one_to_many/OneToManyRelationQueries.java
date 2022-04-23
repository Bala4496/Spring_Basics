package ua.bala.hibernate.relation.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.bala.hibernate.relation.one_to_many.entity.Department;
import ua.bala.hibernate.relation.one_to_many.entity.Employee;

public class OneToManyRelationQueries {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .addAnnotatedClass(Department.class)
            .buildSessionFactory();

        deleteUniDirMethod(factory);
    }

    private static void saveUniDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {

            session.beginTransaction();
            Department dep = new Department("HR", 500, 1500);
            Employee emp1 = new Employee("Sergei", "Balabai", 1200);
            Employee emp2 = new Employee("Andrei", "Mironov", 900);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.save(dep);
            session.getTransaction().commit();
        }
    }

    private static void saveBiDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {

            session.beginTransaction();
            Department dep = new Department("IT", 1000, 2000);
            Employee emp1 = new Employee("Ihor", "Balabai", 800);
            Employee emp2 = new Employee("Elena", "Laikova", 1000);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.save(dep);
            session.getTransaction().commit();
        }
    }

    private static void readUniDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession();) {
            session.beginTransaction();

//            Department dep = session.get(Department.class, 5);
//
//            System.out.println(dep);
//            System.out.println(dep.getEmployees());

            Employee emp = session.get(Employee.class, 1);

            System.out.println(emp);

            session.getTransaction().commit();

        }
    }

    private static void readBiDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {
            session.beginTransaction();

//            Department dep = session.get(Department.class, 1);
//
//            System.out.println(dep);
//            System.out.println(dep.getEmployees());

            Employee emp = session.get(Employee.class, 1);

            System.out.println(emp);
//            System.out.println(emp.getDepartment());

            session.getTransaction().commit();

        }
    }

    private static void deleteUniDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 6);
//
//            session.delete(emp);

            Department dep = session.get(Department.class, 6);

            session.delete(dep);

            session.getTransaction().commit();
        }
    }

    private static void deleteBiDirMethod(SessionFactory factory) {
        try (factory; Session session = factory.getCurrentSession()) {
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 4);

            session.delete(emp);

            session.getTransaction().commit();
        }
    }
}
