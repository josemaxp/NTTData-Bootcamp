package com.nttdata.service;

import com.nttdata.repository.Client;

public interface ClientServiceI {
	/**
	 * Insertar un cliente.
	 * 
	 * @param client {@link Client}
	 * @return Client
	 */
	public Client insertClient(Client client);

	/**
	 * Buscar todos los clientes.
	 */
	public void searchForAllClients();

	/**
	 * Buscar cliente por nombre completo.
	 * 
	 * @param name           {@link String}
	 * @param firstLastName  {@link String}
	 * @param secondLastName {@link String}
	 */
	public void searchByCompleteName(String name, String firstLastName, String secondLastName);

	/**
	 * Buscar por nombre.
	 * 
	 * @param name {@link String}
	 */
	public void searchByName(String name);
	
	/**
	 * Buscar por edad mayor a una dada.
	 * 
	 * @param age
	 */
	public void searchByAge(int age);

}
