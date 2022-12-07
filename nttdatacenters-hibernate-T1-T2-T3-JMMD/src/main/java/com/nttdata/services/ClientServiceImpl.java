package com.nttdata.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.dao.ClientDaoI;
import com.nttdata.persistence.Client;

@Service
public class ClientServiceImpl implements ClientServiceI {
	
	@Autowired
	private ClientDaoI clientDao;

	@Override
	public Client searchForId(int id) {
		
		return clientDao.findById(id);
	}

	@Override
	public List<Client> searchForCompleteName(String name, String lastName) {
		if(name !=null && lastName != null)
			return clientDao.findByNameAndLastName(name, lastName);
		else
			return null;
	}

	@Override
	public void deleteClient(Client entity) {
		clientDao.delete(entity);

	}

	@Override
	public Client updateClient(Client entity) {
		
		return clientDao.update(entity);
	}

	@Override
	public List<Client> getAllClients() {
		
		return clientDao.findAll();
	}

	@Override
	public void insertClient(Client entity) {
		
		clientDao.create(entity);

	}

	@Override
	public List<Client> searchCriteriaForCompleteName(String name, String lastName) {
		return clientDao.criteriaFindByCompleteName(name, lastName);
	}

}
