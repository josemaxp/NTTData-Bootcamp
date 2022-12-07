package com.nttdata.dao;

import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientDAO extends CommonDAO<Client> {

	public List<Client> searchByCompleteName(final String name, final String firstLastName,
			final String secondLastName);

	public List<Client> criteriaFindByCompleteName(final String name, final String firstLastName,
			final String secondLastName);

}
