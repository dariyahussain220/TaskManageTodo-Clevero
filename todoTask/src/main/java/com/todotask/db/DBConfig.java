package com.todotask.db;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DBConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setPassword("Admin@123");
        ds.setUrl("jdbc:mysql://localhost:3306/todoTask");
        ds.setUsername("root");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean lem = new LocalContainerEntityManagerFactoryBean();
        lem.setDataSource(dataSource());
        lem.setPackagesToScan(new String[] { "com.todotask.model" });
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        lem.setJpaVendorAdapter(vendorAdapter);
        lem.setJpaProperties(jpaProperties());
        return lem;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager tx = new JpaTransactionManager();
        tx.setEntityManagerFactory(entityManagerFactory().getObject());
        return tx;
    }

    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    private Properties jpaProperties() {
        
        Properties properties =  new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        return properties;
    }
}
