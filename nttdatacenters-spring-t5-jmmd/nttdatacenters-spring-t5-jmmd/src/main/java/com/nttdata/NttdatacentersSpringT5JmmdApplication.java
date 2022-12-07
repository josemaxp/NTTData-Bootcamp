package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.controller.ClientControllerRest;
import com.nttdata.repository.Client;

@SpringBootApplication
public class NttdatacentersSpringT5JmmdApplication implements CommandLineRunner {

	@Autowired
	ClientControllerRest controller;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(NttdatacentersSpringT5JmmdApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// Nuevos clientes.
		Client client1 = new Client();
		client1.setName("José Manuel");
		client1.setfirstLastName("Marín");
		client1.setSecondLastName("Domínguez");
		client1.setDocument("12345678A");
		client1.setAge(25);

		// Nuevos clientes.
		Client client2 = new Client();
		client2.setName("Paco");
		client2.setfirstLastName("Perez");
		client2.setSecondLastName("Dormido");
		client2.setDocument("12345678A");
		client2.setAge(17);

		controller.insertClient(client1);
		controller.insertClient(client2);

		controller.getAllClients();

		controller.getClientByName("Paco");

	}

}
