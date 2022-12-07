package com.nttdata.bootcamp.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.nttdata.bootcamp.productservice.controller.ControllerClass;

@SpringBootApplication
@EnableEurekaClient
public class NttdatacentersProductServiceJmmdApplication implements CommandLineRunner {

	@Autowired
	ControllerClass controller;

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersProductServiceJmmdApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		controller.getMessage();

	}

}
