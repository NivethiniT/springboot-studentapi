package com.example.studentapi;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentapiApplication.class, args);
    }

    @PostConstruct
    public void showSwaggerURL() {
        System.out.println("\n==============================================");
        System.out.println("Swagger UI is running at:");
        System.out.println("http://localhost:8080/swagger-ui/index.html");
        System.out.println("==============================================\n");
    }
}
