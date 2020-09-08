package com.pathology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class PathologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathologyApplication.class, args);
	}

}
