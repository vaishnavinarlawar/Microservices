package com.fusiontech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringSecurity2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity2Application.class, args);
	}

	@Bean
	public RestTemplate gettemp() {
		return new RestTemplate();

	}
}
