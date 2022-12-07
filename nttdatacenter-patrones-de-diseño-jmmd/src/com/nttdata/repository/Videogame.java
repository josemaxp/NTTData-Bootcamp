package com.nttdata.repository;

/**
 * Clase videojuego
 * 
 * @author josem
 *
 */
public class Videogame {
	public String name;

	public String console;

	public Double score;

	public Videogame(String name, String console, Double score) {
		super();
		this.name = name;
		this.console = console;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getConsole() {
		return console;
	}

	public Double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Videogame [name=" + name + ", console=" + console + ", score=" + score + "]";
	}

}
