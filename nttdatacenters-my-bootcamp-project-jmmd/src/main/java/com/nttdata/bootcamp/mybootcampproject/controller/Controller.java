package com.nttdata.bootcamp.mybootcampproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.mybootcampproject.model.DTO;
import com.nttdata.bootcamp.mybootcampproject.service.ResponseService;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class Controller {
	
	private Counter counter;

	@Autowired
	private ResponseService service;
	
	

	public Controller(MeterRegistry registry) {
		super();
		this.counter = Counter.builder("invocaciones.hello").description("Invocaciones totales").register(registry);
	}



	@GetMapping(value = "/getResponse")
	public ResponseEntity<DTO> getMessage() {

		DTO dto = service.getResponse("200", "Éxito");
		
		counter.increment();

		return ResponseEntity.ok().body(dto);
	}

}