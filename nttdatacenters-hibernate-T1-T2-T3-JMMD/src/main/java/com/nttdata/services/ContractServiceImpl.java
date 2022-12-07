package com.nttdata.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.dao.ContractDaoI;
import com.nttdata.persistence.Contract;

@Service
public class ContractServiceImpl implements ContractServiceI {
	
	@Autowired
	private ContractDaoI conctractDao;

	@Override
	public Contract searchForId(int id) {
		return conctractDao.findById(id);
	}

	@Override
	public List<Contract> getAllContracts() {
		// TODO Auto-generated method stub
		return conctractDao.findAll();
	}

	@Override
	public void insertContract(Contract entity) {
		conctractDao.create(entity);
		
	}

	@Override
	public void updateContract(Contract entity) {
		conctractDao.update(entity);
	}

	@Override
	public void deleteContract(Contract entity) {
		conctractDao.delete(entity);
		
	}

	@Override
	public List<Contract> searchForIdClient(Long idClient) {
		
		return conctractDao.searchByContractByClientId(idClient);
	}

	

}
