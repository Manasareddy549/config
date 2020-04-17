package com.example.anurag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringConfigServer123Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServer123Application.class, args);
	}

}
