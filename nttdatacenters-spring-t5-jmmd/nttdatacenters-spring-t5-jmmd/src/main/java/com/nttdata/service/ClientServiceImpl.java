package com.nttdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.nttdata.repository.Client;
import com.nttdata.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientServiceI {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public Client insertClient(Client client) {
		if (client != null && client.getId() == null) {

			// Insercción de cliente.
			client = clientRepository.save(client);
		}

		return client;
	}

	@Override
	public List<Client> searchForAllClients() {
		// Consulta clientes.
		List<Client> clientList = clientRepository.findAll();

		// Muestra el listado obtenido.
		printCustomers(clientList);

		return clientList;

	}

	@Override
	public void searchByCompleteName(String name, String firstLastName, String secondLastName) {
		// Obtención del listado de clientes por nombre completo.
		final List<Client> searchClients = clientRepository.findByNameAndFirstLastNameAndSecondLastName(name,
				firstLastName, secondLastName);

		// Muestra el listado obtenido.
		printCustomers(searchClients);

	}

	@Override
	public List<Client> searchByName(String name) {
		// Obtención del listado de clientes por nombre.
		final List<Client> searchClients = clientRepository.findByName(name);

		if (searchClients.size() == 0) {
			System.out.println("No se han encontrado resultados.");
		} else {
			System.out.println("Hay " + searchClients.size() + " personas con ese nombre.");
		}
		
		return searchClients;
	}

	/**
	 * Busca por edad mayor a una dada.
	 * 
	 * @param searchCustomers
	 */
	@Override
	public void searchByAge(int age) {
		List<Client> searchClients = clientRepository.findByAgeGreaterThan(age);

		// Muestra el listado obtenido.
		printCustomers(searchClients);

	}

	/**
	 * Recorre e imprime listado de clientes.
	 * 
	 * @param searchCustomers
	 */
	private void printCustomers(final List<Client> searchClients) {
		if (!CollectionUtils.isEmpty(searchClients)) {
			for (Client client : searchClients) {
				System.out.println(client.toString());
			}
		}
	}

}
