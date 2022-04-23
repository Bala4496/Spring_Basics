package ua.bala.spring_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.bala.spring_rest.entity.Employee;
import ua.bala.spring_rest.exception_handler.NoSuchEmployeeException;
import ua.bala.spring_rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) throws NoSuchEmployeeException {
        Employee employee = employeeService.getEmployee(id);

        if (employee == null)
            throw new NoSuchEmployeeException("There is no employee with ID " + id + " in DataBase");

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) throws NoSuchEmployeeException {
        Employee employee = employeeService.getEmployee(id);

        if (employee == null)
            throw new NoSuchEmployeeException("There is no employee with ID " + id + " in DataBase");


        employeeService.deleteEmployee(id);
        return "Employee with ID = " + id + " was deleted";
    }



}