package com.nttdata.bootcamp.webflux.controller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {

	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<List<Integer>> numbers() {

		List<Integer> numbers = new ArrayList<>();

		for (int i = 1; i <= 30; i++) {
			numbers.add(i);
		}

		Flux<List<Integer>> publisher = Flux.just(numbers);

		return publisher;
	}

	@GetMapping(path = "/numbers2", produces = "text/event-stream")
	public Flux<Integer> numbers2() {

		Flux<Integer> publisher = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		/*
		 * Flux<Integer> publisher = Flux.range(1, 30).map(number -> { try {
		 * Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		 * return number; });
		 */

		return publisher;
	}

	@GetMapping(path = "/numbersSuscriber", produces = "text/event-stream")
	public Flux<Integer> numbersSuscriber() {

		Flux<Integer> publisher = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		publisher.subscribe(n -> System.out.println("Subscriber 1: " + n)); // Suscriptor 1

		publisher.subscribe(n -> System.out.println("Subscriber 2: " + n)); // Suscriptor 2

		return publisher;
	}

}
