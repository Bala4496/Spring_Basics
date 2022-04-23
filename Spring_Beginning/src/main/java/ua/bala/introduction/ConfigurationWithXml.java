package ua.bala.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationWithXml {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        System.out.print(person.getName());
        person.getPet().say();

        context.close();
    }
}
