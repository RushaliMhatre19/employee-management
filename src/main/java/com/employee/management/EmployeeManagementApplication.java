package com.employee.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = {
        "com.employee.management",
        "com.example.employeemanagement"
})
@EnableJpaRepositories(basePackages = "com.example.employeemanagement.repository")
@EntityScan(basePackages = "com.example.employeemanagement.entity")
public class EmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementApplication.class, args);
    }
}