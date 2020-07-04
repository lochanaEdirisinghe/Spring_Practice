package lk.lochana.tech.Spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

       /* Map<String, String> getenv = System.getenv();
        for (String key:getenv.keySet()) {
            String value = getenv.get(key);
            System.out.println(key + " "+ value);
        }
        System.out.println("==========================================================");

        Properties properties = System.getProperties();
        for (Object key: properties.keySet()) {
            Object value = properties.get(key);
            System.out.println(key + " "+ value);
        }*/
    }
}
