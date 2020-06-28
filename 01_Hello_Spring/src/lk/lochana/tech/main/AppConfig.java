package lk.lochana.tech.main;

import lk.lochana.tech.beans.Springbean3;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "lk.lochana.tech.beans")
public class AppConfig {

    //@Bean("b3")
    public Springbean3 setSpringbean3(){
        return new Springbean3();
    }

}
