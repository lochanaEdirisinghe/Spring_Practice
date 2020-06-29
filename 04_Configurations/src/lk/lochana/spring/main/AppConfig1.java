package lk.lochana.spring.main;

import lk.lochana.spring.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.lochana.spring.beans")
public class AppConfig1{

    @Bean
    public TestBean1 testBean1(){
        return new TestBean1();
    }
}
