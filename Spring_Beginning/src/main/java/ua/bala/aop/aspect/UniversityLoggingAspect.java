package ua.bala.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ua.bala.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: students list was given");
    }

    @AfterReturning(pointcut = "execution(* getStudents())"
    , returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameStudent = firstStudent.getName();
        nameStudent = "Mr. " + nameStudent;
        firstStudent.setName(nameStudent);

        double avgGradeStudent = firstStudent.getAvgGrade();
        avgGradeStudent++;
        firstStudent.setAvgGrade(avgGradeStudent);

        System.out.println("afterReturningGetStudentsLoggingAdvice: students list was released");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())"
        , throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging throwing exception: " + exception.getMessage());
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: Finished working of method");
    }
}
