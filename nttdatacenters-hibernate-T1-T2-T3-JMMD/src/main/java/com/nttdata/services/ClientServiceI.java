package com.nttdata.services;

import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientServiceI {
	Client searchForId(int id);

	List<Client> searchForCompleteName(String name, String lastName);

	void deleteClient(Client entity);

	Client updateClient(Client entity);

	List<Client> getAllClients();

	void insertClient(Client entity);

	List<Client> searchCriteriaForCompleteName(String name, String lastName);

}
