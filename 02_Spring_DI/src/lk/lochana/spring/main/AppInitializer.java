package lk.lochana.spring.main;

import lk.lochana.spring.beans.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();


        Boy bean = ctx.getBean(Boy.class);
        bean.GoWithGirl();
    }
}
