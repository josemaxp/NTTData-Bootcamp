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
public class ClientDAOImplement extends CommonDAOImplement<Client> implements ClientDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Client> searchByCompleteName(String name, String firstLastName, String secondLastName) {

		List<Client> clients = null;

		if (name != null && firstLastName != null && secondLastName != null) {

			Session currentSession = entityManager.unwrap(Session.class);

			String query = "FROM Client WHERE name = '" + name + "' AND first_last_name = '" + firstLastName
					+ "' AND second_last_name = '" + secondLastName + "'";

			clients = currentSession.createQuery(query).list();

			currentSession.close();
		}

		return clients;
	}

	@Override
	@Transactional
	public List<Client> criteriaFindByCompleteName(String name, String firstLastName, String secondLastName) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Client> cq = cb.createQuery(Client.class);
		Root<Client> root = cq.from(Client.class);
		Predicate pr1 = cb.equal(root.get("name"), name);
		Predicate pr2 = cb.equal(root.get("firstLastName"), firstLastName);
		Predicate pr3 = cb.equal(root.get("secondLastName"), secondLastName);
		cq.select(root).where(cb.and(pr1, cb.or(pr2, pr3)));
		return entityManager.createQuery(cq).getResultList();
	}

}
