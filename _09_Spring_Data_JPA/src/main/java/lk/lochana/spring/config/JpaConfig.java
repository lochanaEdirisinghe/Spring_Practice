package lk.lochana.spring.config;

import lk.lochana.spring.Repository.CustomerRpository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = CustomerRpository.class)
public class JpaConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean EntityManagerFactory(DataSource ds, JpaVendorAdapter va){
        final LocalContainerEntityManagerFactoryBean lcem = new LocalContainerEntityManagerFactoryBean();
        lcem.setPackagesToScan("lk.lochana.spring.Entity");
        lcem.setDataSource(ds);
        lcem.setJpaVendorAdapter(va);
        return lcem;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/pos?createDatabaseIfNotExist=true");
        ds.setUsername("root");
        ds.setPassword("ijse");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        return ds;

    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter jpa = new HibernateJpaVendorAdapter();
        jpa.setDatabasePlatform("org.hibernate.dialect.MySQL57Dialect");
        jpa.setDatabase(Database.MYSQL);
        jpa.setShowSql(true);
        jpa.setGenerateDdl(true);
        return jpa;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory managerFactory){
        return new JpaTransactionManager(managerFactory);
    }
}
