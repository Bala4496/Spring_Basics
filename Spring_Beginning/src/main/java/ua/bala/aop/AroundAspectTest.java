package ua.bala.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundAspectTest {
    public static void main(String[] args) {
        System.out.println("Method main - starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);

        String bookName = library.returnBook();
        System.out.println(bookName + " was returned to the UniLibrary");

        context.close();
        System.out.println("Method main - ends");
    }
}
