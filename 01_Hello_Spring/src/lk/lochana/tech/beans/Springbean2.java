package lk.lochana.tech.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

//@Component("b2")
public class Springbean2 implements DisposableBean{
    public Springbean2(){
        System.out.println("Springbean2 instantiated");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Springbean2 is closed");
    }
}
