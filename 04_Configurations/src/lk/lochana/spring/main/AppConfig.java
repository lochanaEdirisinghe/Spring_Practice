package lk.lochana.spring.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.lochana.spring.beans")
@Import({AppConfig1.class, AppConfig2.class})
//@ImportResource("classpath:filename.xml")
//@ImportResource("file:filename.xml")
public class AppConfig {

}
