package com.learner.springbootcrudwithh2db.config;

import com.learner.springbootcrudwithh2db.entity.dept.Department;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.learner.springbootcrudwithh2db.repository.dept",
        entityManagerFactoryRef = "departmentEntityManagerFactory",
        transactionManagerRef= "departmentTransactionManager"
)
@PropertySource("classpath:application.properties")
public class DepartmentConfig {
    @Bean
    @ConfigurationProperties("spring.first.datasource")
    public DataSourceProperties departmentDataSourceProperties() {
        return new DataSourceProperties();
    }
    @Bean
    @ConfigurationProperties("spring.first.datasource.configuration")
    public DataSource departmentDataSource() {
        return departmentDataSourceProperties().initializeDataSourceBuilder()
                .type(HikariDataSource.class).build();
    }

    /*Secondary Entity Managers*/
    @Bean(name = "departmentEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean departmentEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(departmentDataSource())
                .packages(Department.class)
                .build();
    }

    @Bean
    public PlatformTransactionManager departmentTransactionManager(
            final @Qualifier("departmentEntityManagerFactory") LocalContainerEntityManagerFactoryBean departmentEntityManagerFactory) {
        return new JpaTransactionManager(departmentEntityManagerFactory.getObject());
    }
}
