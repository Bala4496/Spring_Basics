package ua.bala.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationWithAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.callPet();

        context.close();
    }
}
