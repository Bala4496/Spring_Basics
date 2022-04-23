package ua.bala.spring_rest_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.bala.spring_rest_client.configuration.MyConfig;
import ua.bala.spring_rest_client.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println("Get all employees");
//        System.out.println(allEmployees);
//
//        int id = 1;
//        Employee employee = communication.getEmployee(id);
//        System.out.println("Get employee with ID " + id);
//        System.out.println(employee);

//        Employee newEmployee = new Employee("Sveta", "Sokolova", "HR", 500);
//        System.out.println("Save employee with ID " + id);
//        communication.saveEmployee(newEmployee);

//        Employee newEmployee = new Employee("Sveta", "Sokolova", "Sales", 500);
//        newEmployee.setId(9);
//        System.out.println("Update employee with ID " + id);
//        communication.saveEmployee(newEmployee);

//        System.out.println("Delete employee with ID " + id);
//        communication.deleteEmployee(9);

    }
}
