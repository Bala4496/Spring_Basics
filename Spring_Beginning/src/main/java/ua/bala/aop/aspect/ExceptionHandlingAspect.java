package ua.bala.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("ua.bala.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeExceptionHandlingAdvice() {
        System.out.println("beforeExceptionHandlingAdvice: Exception caught");
    }
}
