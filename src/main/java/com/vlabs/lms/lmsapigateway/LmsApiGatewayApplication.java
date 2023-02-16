package com.vlabs.lms.lmsapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LmsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsApiGatewayApplication.class, args);
	}

}
