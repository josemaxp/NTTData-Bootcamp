package com.nttdata.repository;

import java.util.Arrays;
import java.util.List;

public class Edificio {
	private String[] plantas;

	/**
	 * Constructor de la clase Edificio. Se inicializa con el número de plantas.
	 * 
	 * @param plantas
	 */
	public Edificio(int plantas) {
		super();
		this.plantas = new String[plantas];
	}
	
	/**
	 * Getter del parámetro plantas
	 * @return
	 */

	public String[] getPlantas() {
		return plantas;
	}

	/**
	 * Setter del parámetro plantas
	 * @param plantas
	 */
	public void setPlantas(String[] plantas) {
		this.plantas = plantas;
	}

	@Override
	public String toString() {
		return "Edificio [plantas=" + Arrays.toString(plantas) + "]";
	}

}
