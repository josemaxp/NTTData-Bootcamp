package com.nttdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

	/**
	 * Obtener una lista de clientes a partir de su nombre.
	 * 
	 * @param name {@link String}
	 * @return List<Client>
	 */
	public List<Client> findByName(String name);

	/**
	 * Obtener una lista de clientes a partir de su nombre completo.
	 * 
	 * @param name           {@link String}
	 * @param firstLastName  {@link String}
	 * @param secondLastName {@link String}
	 * @return List<Client>
	 */
	public List<Client> findByNameAndFirstLastNameAndSecondLastName(String name, String firstLastName,
			String secondLastName);

	/**
	 * Obtener una lista de clientes mayores de una edad dada
	 * 
	 * @param name           {@link String}
	 * @param firstLastName  {@link String}
	 * @param secondLastName {@link String}
	 * @return List<Client>
	 */
	public List<Client> findByAgeGreaterThan(int age);

}