package com.nttdata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.persistence.Client;
import com.nttdata.persistence.Contract;
import com.nttdata.service.ClientServiceI;

/**
 * Formación - Hibernate - Ejemplo
 * 
 * Clase principal
 * 
 * @author NTT Data Sevilla
 *
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner {

	/** Servicio de gestión de clientes */
	@Autowired
	private ClientServiceI clientService;

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<Client> clients = new ArrayList<>();
		List<Contract> contracts = new ArrayList<>();

		// Generar Clientes
		Client clientA = new Client();
		clientA.setName("Jose Manuel");
		clientA.setFirstLastName("Marin");
		clientA.setSecondLastName("Domínguez");
		clientA.setDocumentId("12345678A");
		
		Client clientB = new Client();
		clientB.setName("Juan");
		clientB.setFirstLastName("López");
		clientB.setSecondLastName("Vega");
		clientB.setDocumentId("12345678B");

		// Generar contratos.
		Contract contract1 = new Contract();
		contract1.setMonthlyPrice(10.2);
		contract1.setCaducityDate(new Date("22/10/2020"));
		contract1.setValiditDate(new Date("30/10/2020"));
		
		Contract contract2 = new Contract();
		contract2.setMonthlyPrice(1.2);
		contract2.setCaducityDate(new Date("22/10/2020"));
		contract2.setValiditDate(new Date("30/10/2020"));

		contracts.add(contract2);
		contracts.add(contract1);

		clientA.setContractList(contracts);

		clients.add(clientA);
		clients.add(clientB);

		for (Client client : clients) {
			System.out.println(client);
		}

		System.out.println("---------------------------");

		clientService.insertClient(clientA);
		clientService.insertClient(clientB);
		
		for (Client client : clientService.getAllClients()) {
			System.out.println(client);
		}
		
		List<Client> clientsSearched = clientService.searchForCompleteName("José Manuel", "Marín", "Domínguez");
		int total = clientsSearched.size();

		System.out.println("Hay un total de " + total + " clientes con ese nombre.");

	}

}
