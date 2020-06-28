package lk.lochana.tech.main;

import lk.lochana.tech.beans.Springbean1;
import lk.lochana.tech.beans.Springbean2;
import lk.lochana.tech.beans.Springbean3;
import lk.lochana.tech.beans.Springbean5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Springbean5 springbean5 = ctx.getBean(Springbean5.class);
        System.out.println(springbean5);

        /*Springbean1 bean1 = ctx.getBean(Springbean1.class);
        System.out.println(bean1);*/

        //ctx.close();

        /*Springbean1 bean2 = ctx.getBean(Springbean1.class);
        System.out.println(bean2);*/

       /* Springbean2 springbean2 = (Springbean2) ctx.getBean("b2");
        System.out.println(springbean2);*/

        /*Springbean3 springbean3 = ctx.getBean(Springbean3.class);
        System.out.println(springbean3);*/

        /*Springbean3 springbean3 = (Springbean3) ctx.getBean("setSpringbean3");
        System.out.println(springbean3);*/

       /* Springbean3 springbean3 = (Springbean3) ctx.getBean("b3");
        System.out.println(springbean3);*/


    }
}
