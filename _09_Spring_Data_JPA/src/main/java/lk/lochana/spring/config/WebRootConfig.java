package lk.lochana.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JpaConfig.class})
public class WebRootConfig {
}
