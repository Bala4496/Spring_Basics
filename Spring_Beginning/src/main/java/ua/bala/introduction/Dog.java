package ua.bala.introduction;

//@Component
public class Dog implements Pet
{
    public Dog() {
        System.out.println(getClass().getSimpleName() + " created");
    }

//    @PostConstruct
    public void init() {
        System.out.println(getClass().getSimpleName() + ": init");
    }

//    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getSimpleName() + ": destroy");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
