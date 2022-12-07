package com.nttdata.bootcamp.mybootcampproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NttdatacentersMyBootcampProjectJmmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersMyBootcampProjectJmmdApplication.class, args);
	}

}
