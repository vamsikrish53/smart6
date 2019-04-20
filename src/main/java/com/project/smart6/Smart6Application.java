package com.project.smart6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project.smart6"}) 
@EnableJpaRepositories
public class Smart6Application {

	public static void main(String[] args) {
		SpringApplication.run(Smart6Application.class, args);
	}

}
