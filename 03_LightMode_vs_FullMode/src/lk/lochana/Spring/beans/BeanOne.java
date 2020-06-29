package lk.lochana.Spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne(){
        System.out.println("bean1 instantiated");
    }
    //Light Mode
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
    }
}
