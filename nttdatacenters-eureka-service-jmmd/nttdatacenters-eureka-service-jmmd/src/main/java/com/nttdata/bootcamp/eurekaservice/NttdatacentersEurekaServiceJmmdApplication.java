package com.nttdata.bootcamp.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NttdatacentersEurekaServiceJmmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersEurekaServiceJmmdApplication.class, args);
		System.out.println("Hola");
	}

}
