package com.example.parcial.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Arquitectura")
                        .version("1.0")
                        .description("Documentación de la API")
                        .contact(new Contact()
                                .name("Soporte Api")
                                .email("michael2003@gmail.com")
                        )
                );
    }
}
