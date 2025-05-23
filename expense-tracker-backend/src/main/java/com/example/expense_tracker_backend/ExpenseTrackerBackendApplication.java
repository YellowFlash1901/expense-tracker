package com.example.expense_tracker_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ExpenseTrackerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerBackendApplication.class, args);
	}

}
