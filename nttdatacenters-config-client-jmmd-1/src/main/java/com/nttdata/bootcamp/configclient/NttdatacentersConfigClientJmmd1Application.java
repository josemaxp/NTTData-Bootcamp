package com.nttdata.bootcamp.configclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.configclient.controller.ControllerClass;


@SpringBootApplication
public class NttdatacentersConfigClientJmmd1Application implements CommandLineRunner {

	@Autowired
	ControllerClass controller;

	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersConfigClientJmmd1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controller.getProduct();
		
	}

}
