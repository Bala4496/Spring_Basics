package ua.bala.introduction;

//@Component("catBean")
public class Cat implements Pet
{
    public Cat() {
        System.out.println(getClass().getSimpleName() + " created");
    }

    @Override
    public void say(){
        System.out.println("Meow-Meow");
    }
}
