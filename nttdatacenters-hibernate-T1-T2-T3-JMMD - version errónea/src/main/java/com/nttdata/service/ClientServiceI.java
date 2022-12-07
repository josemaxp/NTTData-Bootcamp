package com.nttdata.service;

import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientServiceI {
	public Client searchForId(Long id);

	public List<Client> searchForCompleteName(String nom, String firstLastName, String secondLastName);

	public void deleteClient(Client entity);

	public void updateClient(Client entity);

	public List<Client> getAllClients();

	public void insertClient(Client entity);

}
