package com.example.expense_tracker_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.expense_tracker_backend")
@EnableJpaRepositories("com.example.expense_tracker_backend.repository")
@EntityScan("com.example.expense_tracker_backend.entity")
public class ExpenseTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerBackendApplication.class, args);
	}

}
