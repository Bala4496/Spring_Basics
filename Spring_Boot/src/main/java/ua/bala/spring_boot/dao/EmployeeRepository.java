package ua.bala.spring_boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.bala.spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAddByName(String name);
}
