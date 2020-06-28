package lk.lochana.tech.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class Springbean4 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public Springbean4(){
        System.out.println("Springbean4 instantiated");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("object distroy");
    }
}
