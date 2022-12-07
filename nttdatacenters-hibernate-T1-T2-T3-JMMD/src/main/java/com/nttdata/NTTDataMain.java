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
import com.nttdata.services.ClientServiceI;
import com.nttdata.services.ContractServiceI;

/**
 * Formación - Hibernate - Ejemplo
 * 
 * Clase principal
 * 
 * @author Eulogio Enamorado Pallares
 *
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner {

	@Autowired
	private ClientServiceI clientService;

	@Autowired
	private ContractServiceI contractService;
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

		System.out.println("Iniciando programa...");

		System.out.println("Creando clientes...");

		Client client1 = new Client();
		client1.setName("José Manuel");
		client1.setFirstLastName("Marín");
		client1.setSecondLastName("Domínguez");
		client1.setDocumentId("12345678A");

		Client client2 = new Client();
		client2.setName("Ana");
		client2.setFirstLastName("García");
		client2.setSecondLastName("Sánchez");
		client2.setDocumentId("87654321A");

		clientService.insertClient(client1);
		clientService.insertClient(client2);

		System.out.println("Mostrando clientes...");

		List<Client> clientsList = clientService.getAllClients();

		for (Client client : clientsList) {
			System.out.println(client);
		}

		System.out.println("Actualizando cliente...");
		
		client1.setDocumentId("99999999A");
		clientService.updateClient(client1);
		
		System.out.println("Mostrando clientes...");

		clientsList = clientService.getAllClients();
		System.out.println("Lista Clientes Actualizada");
		for (Client client : clientsList) {
			System.out.println(client);
		}
		
		System.out.println("Buscando cliente...");
		
		List<Client> clientsFinded = clientService.searchForCompleteName("José Manuel", "Marín");
		
		int total = clientsFinded.size();

		System.out.println("Hay un total de " + total + " clientes con ese nombre.");
		
		
		System.out.println("Creando contractos...");
		
		
		Contract contract1 = new Contract();
		contract1.setMonthlyPrice(10.2);
		contract1.setCaducityDate(new Date("22/10/2020"));
		contract1.setValiditDate(new Date("30/10/2020"));
		
		Contract contract2 = new Contract();
		contract2.setMonthlyPrice(1.2);
		contract2.setCaducityDate(new Date("22/10/2020"));
		contract2.setValiditDate(new Date("30/10/2020"));
		
		contractService.insertContract(contract1);
		contractService.insertContract(contract2);
		
		System.out.println("Mostrando contratos...");
		
		List<Contract> contractList = contractService.getAllContracts();
		for (Contract contract : contractList) {
			System.out.println(contract.toString());
		}
		
		System.out.println("Mostrando búsqueda (Criteria)...");
		
		List<Client> criteriaSearch = clientService.searchCriteriaForCompleteName("José Manuel", "Marín");
		for(Client client: criteriaSearch) {
			System.out.println(client.toString());
		}
		
		System.out.println("Cerrando programa...");

	}

}
