package ua.bala.spring_rest_client.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("ua.bala.spring_rest_client")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
