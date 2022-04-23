package ua.bala.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void addBook(){
        System.out.println("We added the book to " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
    }

    public void addBook(String name, Book book) {
        System.out.println(name + " added the book " + book.getName() + " to " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");

    }

    public void getBook(){
        System.out.println("We took the book from " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
    }

    public String returnBook() {
//        int i = 10/0;
        System.out.println("We returned the book to " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
        return "Master and Margarita";
    }

    public void addMagazine(){
        System.out.println("We added the magazine to " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
    }

    public void getMagazine(){
        System.out.println("We took the magazine from " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We returned the magazine to " + getClass().getSimpleName());
        System.out.println("----------------------------------------------------");
    }
}
