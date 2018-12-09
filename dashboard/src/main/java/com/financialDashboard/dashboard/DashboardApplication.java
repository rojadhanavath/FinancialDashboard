package com.financialDashboard.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = {"com.financialDashboard.controllers","com.financialDashboard.services" })
@EnableJpaRepositories (basePackages = "com.financialDashboard.repositories")
@EntityScan (basePackages = "com.financialDashboard.models")
public class DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}


}
