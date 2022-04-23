package ua.bala.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ua.bala.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* ua.bala.spring.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(public void ua.bala.spring.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineFromUniLibrary() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineFromUniLibrary: Log for not 'returnMagazine()' method");
//    }

//    @Pointcut("execution(* ua.bala.spring.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* ua.bala.spring.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {}
//
//    @Pointcut("allReturnMethodsFromUniLibrary() || allGetMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }

    //@Before("ua.bala.spring.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("beforeAddLoggingAdvice: Logging process for the book");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj: args) {
                if(obj instanceof Book){
                    Book book = (Book) obj;
                    System.out.println("Book info: \n" +
                        "\tName: " + book.getName() + "\n" +
                        "\tAuthor: " + book.getAuthor() + "\n" +
                        "\tYear of publication: " + book.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Book was added by " + obj);
                }
            }
        }
    }

}
