package com.nttdata.bootcamp.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/port")
	public String getMessage() {
		return "El puerto del micro es 8080";
	}
}
