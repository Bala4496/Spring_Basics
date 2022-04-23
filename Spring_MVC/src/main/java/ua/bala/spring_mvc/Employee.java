package ua.bala.spring_mvc;

import ua.bala.spring_mvc.Validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min than 2 symbols")
    private String name;
//    @NotNull(message = "surname is required field")
//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "salary must be greater than 499")
    @Max(value = 1000, message = "salary must be greater less 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String gender;
    private Map<String, String> genders;
    private String[] languages;
    private Map<String, String> languageMap;
    @CheckEmail(value = "google.com", message = "email must ends with '???'")
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");
        genders = new HashMap<>();
        genders.put("Male", "Male");
        genders.put("Female", "Female");
        languageMap = new HashMap<>();
        languageMap.put("English", "EN");
        languageMap.put("French", "FR");
        languageMap.put("Deutsch", "GE");
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            ", department='" + department + '\'' +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, String> getGenders() {
        return genders;
    }

    public void setGenders(Map<String, String> genders) {
        this.genders = genders;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map<String, String> languageMap) {
        this.languageMap = languageMap;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
