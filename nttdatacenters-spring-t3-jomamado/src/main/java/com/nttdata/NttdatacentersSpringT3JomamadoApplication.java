package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repository.Client;
import com.nttdata.service.ClientServiceI;

@SpringBootApplication
public class NttdatacentersSpringT3JomamadoApplication implements CommandLineRunner {

	/** Servicio de gestión de clientes */
	@Autowired
	private ClientServiceI clientService;

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NttdatacentersSpringT3JomamadoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Iniciando programa...");

		System.out.println("Creando clientes...");

		// Nuevos clientes.
		Client client1 = new Client();
		client1.setName("José Manuel");
		client1.setfirstLastName("Marín");
		client1.setSecondLastName("Domínguez");
		client1.setDocument("12345678A");
		client1.setAge(25);
		clientService.insertClient(client1);

		Client client2 = new Client();
		client2.setName("Ana");
		client2.setfirstLastName("García");
		client2.setSecondLastName("Sánchez");
		client2.setDocument("987654321A");
		client1.setAge(17);
		clientService.insertClient(client2);

		System.out.println("Mostrando todos los clientes...");

		clientService.searchForAllClients();

		System.out.println("Mostrando los clientes con ese nombre...");

		clientService.searchByName("José Manuel");

		System.out.println("Mostrando los clientes con ese nombre y apellidos...");

		clientService.searchByCompleteName("José Manuel", "Marín", "Domínguez");
		
		System.out.println("Mostrando los clientes mayores de 18 años...");

		clientService.searchByAge(18);

		System.out.println("Cerrando programa...");
	}

}
