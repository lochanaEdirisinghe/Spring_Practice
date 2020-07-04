package lk.lochana.tech.Spring.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SprinBean3 implements InitializingBean {

    @Autowired
    Environment env;

    public SprinBean3(){
        System.out.println("Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.env.getProperty("my.name"));
        System.out.println(this.env.getProperty("USERNAME"));
        System.out.println(this.env.getRequiredProperty("USERNAME")); //Give exception if there is any error
        System.out.println(this.env.getProperty("LOGNAME"));
    }
}
