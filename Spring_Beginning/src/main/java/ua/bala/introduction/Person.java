package ua.bala.introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println(getClass().getSimpleName() + " created");
    }

//    @Autowired
    public Person(/*@Qualifier("dog")*/ Pet pet) {
        System.out.println(getClass().getSimpleName() + " created with Pet");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
    this.pet = pet;
}

    public void callPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }

    public void init() {
        System.out.println(getClass().getSimpleName() + ": init");
    }

    public void destroy() {
        System.out.println(getClass().getSimpleName() + ": destroy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass().getSimpleName() + ": set name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(getClass().getSimpleName() + ": set age");

        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }
}
