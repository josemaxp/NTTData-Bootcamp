package com.nttdata.builder;

/**
 * Clase builder para los Videojuegos
 * @author josem
 *
 */
public interface Builder {
	void setName(String name);

	void setConsole(String console);

	void setScore(Double score);

}
