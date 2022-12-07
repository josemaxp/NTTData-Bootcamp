package com.nttdata.bootcamp.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NttdatacentersConfigServiceJmmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersConfigServiceJmmdApplication.class, args);
	}

}
