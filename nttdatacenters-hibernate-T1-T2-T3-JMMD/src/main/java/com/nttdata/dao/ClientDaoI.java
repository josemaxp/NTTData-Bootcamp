package com.nttdata.dao;

import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientDaoI extends CommonDaoI<Client>{
	
	List<Client> findByNameAndLastName(String name, String lastName);
	
	List<Client> criteriaFindByCompleteName(String name, String lastName);

}
