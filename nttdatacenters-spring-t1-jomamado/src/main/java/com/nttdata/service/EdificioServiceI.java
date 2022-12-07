package com.nttdata.service;

import com.nttdata.repository.Edificio;

/**
 * Servicio para gestionar los edificios.
 * 
 * @author josem
 *
 */
public interface EdificioServiceI {

	/**
	 * Crear nuevo edificio a partir del número de plantas dado.
	 * 
	 * @param numPlantas enetero número de plantas
	 * @return {@link Edificio} creado
	 * @throws Exception En caso de error
	 */
	public Edificio createEdificio(int numPlantas) throws Exception;

	/**
	 * Agregar una nueva persona a un edificio ya creado
	 * 
	 * @param edificio        {@link Edificio} edificio
	 * @param numPlanta       enetero número de la planta
	 * @param nombreApellidos {@link String} nombe y apellidos de la persona a poner
	 *                        en la planta
	 * @throws Exception En caso de error
	 */
	public void agregarPersonaEdificioPlanta(Edificio edificio, int numPlanta, String nombreApellidos) throws Exception;

	/**
	 * Busca si la persona se encuentra en el edificio
	 * 
	 * @param edificio        {@link Edificio} edificio
	 * @param nombreApellidos {@link String} nombe y apellidos de la persona a
	 *                        buscar
	 * @throws Exception En caso de error
	 */
	public void buscarPersona(Edificio edificio, String nombreApellidos) throws Exception;

	/**
	 * Muestra todos los propietarios del edificio.
	 * 
	 * @param edificio {@link Edificio} edificio
	 * @throws Exception En caso de error
	 */
	public void mostrarPropietarios(Edificio edificio) throws Exception;

}
