package com.nttdata.dao;

import java.util.List;

import com.nttdata.persistence.Client;
import com.nttdata.persistence.Contract;

public interface ContractDAO extends CommonDAO<Contract>{
	
	public List<Contract> searchByContractByClientId(Client client);

}
