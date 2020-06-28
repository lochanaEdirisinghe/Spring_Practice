package lk.lochana.tech.beans;

import org.springframework.beans.factory.DisposableBean;

public class Springbean3 implements DisposableBean {
    public Springbean3(){
        System.out.println("Springbean3 instantiated");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Springbean3 is closed");
    }
}
