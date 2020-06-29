package lk.lochana.Spring.main;

import lk.lochana.Spring.beans.BeanOne;
import lk.lochana.Spring.beans.BeanThree;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

    }
}
