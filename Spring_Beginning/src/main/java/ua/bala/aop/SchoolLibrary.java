package ua.bala.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

//    @Override
    public void getBook(){
        System.out.println("We took the book from " + getClass().getSimpleName());
    }
}
