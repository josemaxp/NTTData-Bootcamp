package com.nttdata.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nttdata.persistence.Client;

@Repository
public class ClientDaoImpl extends CommonDaoImpl<Client> implements ClientDaoI {
	
	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Client> findByNameAndLastName(String name, String lastName) {

		// Obtención de sesión
		Session currentSession = entityManager.unwrap(Session.class);

		// Busqueda de todos los registros
		List<Client> clients = currentSession.createQuery(
				"FROM Client WHERE name = '" + name + "' and "
						+ "(firstLastName = '" + lastName + "' or secondLastName = '"
						+ lastName + "')").list();
		
		currentSession.close();

		return clients;
	}

	@Override
	@Transactional
	public List<Client> criteriaFindByCompleteName(String name, String lastName) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Client> cq = cb.createQuery(Client.class);
		Root<Client> root = cq.from(Client.class);
		Predicate pr1 = cb.equal(root.get("name"), name);
		Predicate pr2 = cb.equal(root.get("firstLastName"), lastName);
		Predicate pr3 = cb.equal(root.get("secondLastName"), lastName);
		cq.select(root).where(cb.and(pr1, cb.or(pr2, pr3)));
		return entityManager.createQuery(cq).getResultList();
	}

}
