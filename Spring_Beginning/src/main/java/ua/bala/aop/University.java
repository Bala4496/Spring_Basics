package ua.bala.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("John", 1, 4.0);
        Student student2 = new Student("Jane", 2, 4.5);
        Student student3 = new Student("Tom", 3, 5.0);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Start working of method getStudents():");
//        System.out.println(students.get(3));
        System.out.println("Info from method getStudents():");
        System.out.println(students);
        return students;
    }
}
