package com.nttdata.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.persistence.Client;
import com.nttdata.persistence.Contract;

public class ContractDAOImplement extends CommonDAOImplement<Contract> implements ContractDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Contract> searchByContractByClientId(Client client) {
		List<Contract> contract = null;

		if (client != null && client.getId() != null) {

			Session currentSession = entityManager.unwrap(Session.class);

			contract = currentSession.createQuery("FROM Contract WHERE id_client = " + client.getId()).list();
		}

		return contract;
	}

}
