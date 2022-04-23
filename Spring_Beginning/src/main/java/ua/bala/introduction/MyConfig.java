package ua.bala.introduction;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("ua.bala.spring.introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Pet dogBean(){
        return new Dog();
    }

    @Bean
    public Person personBean(){
        return new Person(dogBean());
    }

}
