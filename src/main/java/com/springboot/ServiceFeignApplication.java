package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}