package com.nttdata.singleton;

import com.nttdata.repository.Videogame;

public final class Singleton {
	private static Singleton instance;
	public Videogame videogame;

	private Singleton(Videogame videogame) {
		this.videogame = videogame;
	}

	public static Singleton getInstance(Videogame videogame) {
		if (instance == null) {
			instance = new Singleton(videogame);
		}
		return instance;
	}
}
