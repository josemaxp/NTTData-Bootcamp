package com.nttdata.bootcamp.webflux.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webflux.repository.Person;

import reactor.core.publisher.Flux;

@RestController
public class Controller {
	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Flux<Person> publisher = Flux.just(new Person()).delayElements(Duration.ofSeconds(1));
		return publisher;
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Flux<Person> publisher = Flux.just(new Person()).delayElements(Duration.ofSeconds(1));
		return publisher;
	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Flux<Person> publisher = Flux.just(new Person()).delayElements(Duration.ofSeconds(1));
		return publisher;
	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Flux<Person> publisher = Flux.just(new Person()).delayElements(Duration.ofSeconds(1));
		return publisher;
	}
}
