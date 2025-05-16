package com.jovi.rpgCp2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Mercado Medieval API", version = "v1", description = "API do SaaS Mercado Medieval")
)
@EnableCaching
public class RpgCp2Application {

	public static void main(String[] args) {
		SpringApplication.run(RpgCp2Application.class, args);
	}

}
