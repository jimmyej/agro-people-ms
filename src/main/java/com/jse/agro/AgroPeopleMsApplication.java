package com.jse.agro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AgroPeopleMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroPeopleMsApplication.class, args);
	}

}
