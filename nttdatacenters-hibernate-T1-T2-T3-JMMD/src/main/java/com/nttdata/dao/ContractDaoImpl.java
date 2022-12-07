package com.nttdata.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.persistence.Client;
import com.nttdata.persistence.Contract;

@Repository
public class ContractDaoImpl extends CommonDaoImpl<Contract> implements ContractDaoI {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Contract> searchByContractByClientId(Long idClient) {

		// Obtención de sesión
		Session currentSession = entityManager.unwrap(Session.class);

		// Busqueda de todos los registros
		List<Contract> contract = currentSession.createQuery("FROM Contract WHERE client.id_client = " + idClient)
				.list();

		currentSession.close();

		return contract;
	}

}
