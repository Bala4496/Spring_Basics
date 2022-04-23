package ua.bala.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookAspect: a trying to return the book");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("aroundReturnBookAspect: " + e.getMessage());
            throw e;
        }

        System.out.println("aroundReturnBookAspect: the book was returned successfully");
        return targetMethodResult;
    }
}
