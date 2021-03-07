package com.learner.springbootcrudwithh2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootCrudWithH2dbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudWithH2dbApplication.class, args);
	}

}
