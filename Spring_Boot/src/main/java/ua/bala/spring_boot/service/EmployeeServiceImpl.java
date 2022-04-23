//package ua.bala.spring_boot.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import ua.bala.spring_boot.dao.EmployeeRepository;
//import ua.bala.spring_boot.entity.Employee;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {   // You can remove it if use 'spring-boot-starter-data-rest'
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
////    private EmployeeDAO employeeDAO; // removed @Transactional
//
//    @Override
//    public List<Employee> getAllEmployees() {
////        return employeeDAO.getAllEmployees();
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public void saveEmployee(Employee employee) {
////        employeeDAO.saveEmployee(employee);
//        employeeRepository.save(employee);
//    }
//
//    @Override
//    public Employee getEmployee(int id) {
////        Employee employee = employeeDAO.getEmployee(id);
//        Employee employee = null;
//        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
//        if (optionalEmployee.isPresent())
//            employee = optionalEmployee.get();
//
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public List<Employee> findAddByName(String name) {
//        List<Employee> employees = employeeRepository.findAddByName(name);
//        return employees;
//    }
//
//}
