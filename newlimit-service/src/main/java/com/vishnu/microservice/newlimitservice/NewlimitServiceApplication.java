package com.vishnu.microservice.newlimitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.vishnu.microservice.config.MyAppProperties;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({ "com.vishnu.microservice.newlimitservice.*", "com.vishnu.microservice.config" })
public class NewlimitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewlimitServiceApplication.class, args);
	}

}
