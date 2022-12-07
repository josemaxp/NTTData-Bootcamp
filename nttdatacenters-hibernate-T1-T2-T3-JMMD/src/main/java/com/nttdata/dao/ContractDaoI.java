package com.nttdata.dao;

import java.util.List;

import com.nttdata.persistence.Contract;

public interface ContractDaoI extends CommonDaoI<Contract>{
	
	List<Contract> searchByContractByClientId(Long idClient);

}
