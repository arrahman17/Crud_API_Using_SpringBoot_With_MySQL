package com.example.MySqlTest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.MySqlTest1")
@SpringBootApplication
public class MySqlTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(MySqlTest1Application.class, args);
	}

}
