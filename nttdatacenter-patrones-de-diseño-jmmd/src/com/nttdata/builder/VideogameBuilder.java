package com.nttdata.builder;

import com.nttdata.repository.Videogame;

public class VideogameBuilder implements Builder {

	private String name;
	private String console;
	private Double score;

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setConsole(String console) {
		this.console = console;

	}

	@Override
	public void setScore(Double score) {
		this.score = score;

	}
	
	public Videogame build() {
        return new Videogame(name, console, score);
    }

}
