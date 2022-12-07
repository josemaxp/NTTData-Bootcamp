package com.nttdata.bootcamp.webflux.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.bootcamp.webflux.repository.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonService {
	public Flux<Person> allPerson() {
		
		WebClient webclient = WebClient.builder()
				.baseUrl("http://localhost:8080")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.defaultHeader(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
				.build();
		
		return webclient.get()
				.uri("/person-list")
				.retrieve()
				.bodyToFlux(Person.class);
		
	}
}
