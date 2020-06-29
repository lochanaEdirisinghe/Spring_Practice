package lk.lochana.spring.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements GoodGirl {
    public Girl2(){
        System.out.println("Girl2 Instantiated");
    }

    @Override
    public void kiss() {
        System.out.println("DDDDDDDDddddddd");
        System.out.println("DDDDDDDDddddddd");
    }
}
