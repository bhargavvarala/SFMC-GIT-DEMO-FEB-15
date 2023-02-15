package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SfmcGitDemoFeb10PmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfmcGitDemoFeb10PmApplication.class, args);
	}
	@Bean
	 RestTemplate restTemplate() {
		 RestTemplate restTemplate = new RestTemplate();
	    return restTemplate;
	}
}
