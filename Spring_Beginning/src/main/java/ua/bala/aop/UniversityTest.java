package ua.bala.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class UniversityTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        context.close();
    }
}
