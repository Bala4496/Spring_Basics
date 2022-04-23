package ua.bala.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        SchoolLibrary library = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library.getBook();

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Ihor", book);
        uniLibrary.addMagazine();

//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
//        uniLibrary.getBook("Master and Margarita");
//        uniLibrary.returnBook();

        context.close();
    }
}
