package com.example.dogdiscoverer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DogdiscovererApplication {
	
	@Autowired
	EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(DogdiscovererApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "hi!";
	}
	
	@GetMapping("/appdogurl")
	public String returnAppdogUrl() {
		return eurekaClient.getNextServerFromEureka("appdog", false).toString();
	}
	

}
