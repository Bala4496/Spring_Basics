package ua.bala.spring_boot.dao;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.bala.spring_boot.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        // Hibernate
//        Session session = sessionFactory.getCurrentSession();
//        List<Employee> allEmployees = session.createQuery("from Employee", Employee.class).getResultList();

        // JPA
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        // Hibernate
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(employee);

        // JPA
        Employee newEmployee = entityManager.merge(employee);
        employee.setId(newEmployee.getId());

    }

    @Override
    public Employee getEmployee(int id) {
        // Hibernate
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);

        // JPA
        Employee employee = entityManager.find(Employee.class, id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        // Hibernate
//        Session session = sessionFactory.getCurrentSession();
//
//        Query query = session.createQuery("delete from Employee " +
//            "where id =:employeeId");
//        query.setParameter("employeeId", id);
//
//        query.executeUpdate();

        // JPA
        Query query = entityManager.createQuery("delete from Employee " +
            "where id =:employeeId");
        query.setParameter("employeeId", id);

        query.executeUpdate();
    }
}
