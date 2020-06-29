package lk.lochana.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl{
    public Girl(){
        System.out.println("Girl Instantiated");
    }
    @Override
    public void kiss() {
        System.out.println("DDDDDDDDD");
    }
}
