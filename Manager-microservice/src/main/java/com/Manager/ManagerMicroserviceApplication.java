package com.Manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ManagerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerMicroserviceApplication.class, args);
	}

}
