package com.nttdata.bootcamp.mybootcampproject.service;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.mybootcampproject.model.DTO;

@Service
public class ResponseService {

	public DTO getResponse(String code, String message) {
		return new DTO(code,message);
	}

}
