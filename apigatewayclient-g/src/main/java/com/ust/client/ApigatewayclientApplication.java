package com.ust.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApigatewayclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayclientApplication.class, args);
	}
	@Bean
	public RestTemplate newTemplate() {
		return new RestTemplate();
	}


}
