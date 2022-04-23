//package ua.bala.spring_boot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import ua.bala.spring_boot.entity.Employee;
//import ua.bala.spring_boot.service.EmployeeService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class MyRestController {   // You can remove it if use 'spring-boot-starter-data-rest'
//
//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping("/employees")
//    public List<Employee> getAllEmployees(){
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id) {
//        return employeeService.getEmployee(id);
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee){
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        employeeService.deleteEmployee(id);
//        return "Employee with ID = " + id + " was deleted";
//    }
//
//    @GetMapping("/employees/name/{name}")
//    public List<Employee> findAllByName(@PathVariable String name) {
//        List<Employee> employees = employeeService.findAddByName(name);
//        return employees;
//    }
//
//}
