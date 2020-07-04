package lk.lochana.tech.Spring.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("lk.lochana.tech.Spring.beans")
@PropertySource("classpath:application.properties")
public class AppConfig {

}
