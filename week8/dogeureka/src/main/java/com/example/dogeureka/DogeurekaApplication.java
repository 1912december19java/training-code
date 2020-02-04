package com.example.dogeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DogeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogeurekaApplication.class, args);
	}

}
