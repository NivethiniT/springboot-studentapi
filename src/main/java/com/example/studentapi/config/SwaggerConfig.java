package com.example.studentapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Student API",
                version = "1.0",
                description = "Swagger documentation for Student REST API"
        )
)
public class SwaggerConfig {
}
