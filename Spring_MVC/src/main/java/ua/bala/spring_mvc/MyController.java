package ua.bala.spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetailsView(Model model) {

        model.addAttribute("employee", new Employee());

//        Employee employee = new Employee();
//        employee.setName("Ihor");
//        employee.setSurname("Balabai");
//        employee.setSalary(700);
//        model.addAttribute("employee", employee);

        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("empName", empName);
//        model.addAttribute("description", "Java developer");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView(@RequestParam("employeeName") String empName, Model model) {
//
//        empName = "Mr. " + empName;
//
//        model.addAttribute("empName", empName);
//        model.addAttribute("description", "Junior Java developer");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetailsView(@ModelAttribute("employee") Employee employee) {
//
//        String name = employee.getName();
//        employee.setName("Mr. " + name);
//
//        int salary = employee.getSalary();
//        employee.setSalary(salary * 10);
//
//        return "show-emp-details-view";
//    }

    @PostMapping("/showDetails")
    public String showEmpDetailsView(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "ask-emp-details-view";
        else
            return "show-emp-details-view";
    }
}
