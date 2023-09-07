package com.example.demo.config;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

public class swaggerConfig {
     @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Primeira api")
                .description("Descrição da sua API de Chat")
                .version("1.0.0"));
    }
}
