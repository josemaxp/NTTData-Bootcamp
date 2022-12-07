package com.nttdata.bootcamp.retoconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NttdatacentersRetoConfigServiceJmmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersRetoConfigServiceJmmdApplication.class, args);
	}

}
