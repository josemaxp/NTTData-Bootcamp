package com.nttdata.bootcamp.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webflux.repository.Person;
import com.nttdata.bootcamp.webflux.service.PersonService;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> publisher = personService.allPerson();
		model.addAttribute("personlist",publisher);
		return "personlist";
	}
}
