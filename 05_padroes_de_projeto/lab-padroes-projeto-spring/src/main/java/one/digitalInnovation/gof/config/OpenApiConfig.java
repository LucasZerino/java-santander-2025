package one.digitalInnovation.gof.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Lab Padrões de Projeto Spring")
                        .description("API REST para demonstração de padrões de projeto com Spring Boot")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Lucas Zerino")
                                .email("lucas@example.com")));
    }
} 