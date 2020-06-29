package lk.lochana.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Qualifier("girl2")
    @Autowired
    GoodGirl girl;

    public Boy(){
        System.out.println("Boy Instantiated");
    }

    public void GoWithGirl(){
        this.girl.kiss();
    }

}
