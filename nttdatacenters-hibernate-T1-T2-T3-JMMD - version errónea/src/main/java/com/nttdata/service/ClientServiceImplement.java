package com.nttdata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.dao.ClientDAO;
import com.nttdata.persistence.Client;

@Service
public class ClientServiceImplement implements ClientServiceI {

	@Autowired
	private ClientDAO clientDAO;

	@Override
	public Client searchForId(Long id) {
		// Resultado.
		Client client = null;

		// Verificación de nulidad.
		if (id != null) {

			// Obtención del contrato por ID.
			client = clientDAO.searchById(id);
		}

		return client;
	}

	@Override
	public List<Client> searchForCompleteName(String nom, String firstLastName, String secondLastName) {
		// Resultado.
		List<Client> clients = null;

		// Verificación de nulidad.
		if (nom != null && firstLastName != null && secondLastName != null) {

			// Obtención del contrato por ID.
			clients = clientDAO.searchByCompleteName(nom, firstLastName, secondLastName);
		}

		return clients;
	}

	@Override
	public void deleteClient(Client entity) {
		// Verificación de nulidad y existencia.
		if (entity != null && entity.getId() != null) {

			// Eliminación del contrato.
			clientDAO.delete(entity);
		}
	}

	@Override
	public void updateClient(Client entity) {
		// Verificación de nulidad y existencia.
		if (entity != null && entity.getId() != null) {

			// Actualización del contrato.
			clientDAO.update(entity);
		}
	}

	@Override
	public List<Client> getAllClients() {
		// Resultado.
		List<Client> clientList = new ArrayList<Client>();

		// Obtención de contratos.
		clientList = clientDAO.searchAll();

		return clientList;
	}

	@Override
	public void insertClient(Client entity) {
		// Verificación de nulidad e inexistencia.
		if (entity != null && entity.getId() != null) {

			// Insercción del nuevo contrato.
			clientDAO.insert(entity);
		}

	}

}
