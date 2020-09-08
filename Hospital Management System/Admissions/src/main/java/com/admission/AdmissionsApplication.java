package com.admission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdmissionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionsApplication.class, args);
	}

}
