package com.datta;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Flux<String> publisher = Flux.just("Hello", "World");
		Mono<String> publisher2 = Mono.just("Hello");

		publisher.subscribe(m -> System.out.println("Consumer 1, recibido " + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Cosumer 1 ha terminado"));

		publisher.subscribe(m -> System.out.println("Consumer 2, recibido " + m),
				e -> System.out.println("Ha habido un error" + e.getMessage()),
				() -> System.out.println("Cosumer 2 ha terminado"));

	}
}
