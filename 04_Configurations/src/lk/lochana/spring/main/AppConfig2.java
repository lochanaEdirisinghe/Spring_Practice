package lk.lochana.spring.main;

import lk.lochana.spring.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.lochana.spring.beans")
public class AppConfig2 {

    @Bean
    public TestBean2 testBean2(){
        return new TestBean2();
    }
}
