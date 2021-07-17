package com.mailsonymathew.microservices.limitsservicev2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "Limits API", version = "1.0", description = "Documentation of Limits API v1.0"))
public class LimitsServiceV2Application {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceV2Application.class, args);
	}

}
