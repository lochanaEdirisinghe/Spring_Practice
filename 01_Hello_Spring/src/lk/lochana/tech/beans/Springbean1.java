package lk.lochana.tech.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

//@Component
public class Springbean1 implements DisposableBean {
    public Springbean1(){
        System.out.println("SpringBean1 instantiated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Springbean1 is closed");
    }
}
