package lk.lochana.tech.Spring.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean2 implements InitializingBean {
    //USERNAME, NUMBER_OF_PROCESSORS,   sun.java.launcher
    @Value("${my.name}")
    private String detail;


    public SpringBean2(){
        System.out.println("Instantiated");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.detail);
    }
}
