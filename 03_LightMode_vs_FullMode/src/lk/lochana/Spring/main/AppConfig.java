package lk.lochana.Spring.main;

import lk.lochana.Spring.beans.BeanThree;
import lk.lochana.Spring.beans.BeanTwo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lk.lochana.Spring.beans")
public class AppConfig {

  /*  //Full Mode
    @Bean
    public BeanTwo btwo(){
        //Interbean Dependancy
        BeanThree bthree1 = bthree();
        BeanThree bthree2 = bthree();
        System.out.println(bthree1);
        System.out.println(bthree2);
        return new BeanTwo();
    }

    @Bean
    public BeanThree bthree(){
        return new BeanThree();
    }*/
}
