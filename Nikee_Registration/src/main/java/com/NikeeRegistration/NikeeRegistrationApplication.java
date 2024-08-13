package com.NikeeRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NikeeRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NikeeRegistrationApplication.class, args);
	}

}
