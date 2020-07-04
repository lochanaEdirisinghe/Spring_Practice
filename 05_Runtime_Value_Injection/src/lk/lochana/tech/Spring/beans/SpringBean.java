package lk.lochana.tech.Spring.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBean implements BeanNameAware, InitializingBean {

    @Value("Lochana")
    private String myName;
    public SpringBean(){
        System.out.println("Default Constructor");
        System.out.println(this.myName);
    }

    //@Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("25") int age){
        System.out.println("Args Constructor");
        System.out.println(id +" "+ age);
    }
    //@Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("Panadura") String address , @Value("50") int age){
        System.out.println("Args Constructor");
        System.out.println(id +" "+ address);
    }
    //@Autowired
    public SpringBean(@Value("Kamal, Dasun, Namal") String[] names){
        System.out.println("Args Constructor");
        for (String name:names) {
            System.out.println(name);
        }

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.myName);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(this.myName);
    }
}
