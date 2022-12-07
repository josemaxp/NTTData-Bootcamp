package com.nttdata.service;

import com.nttdata.repository.Pedido;
import com.nttdata.repository.Producto;

public interface ProductoServiceI {

	/**
	 * Calcular el pvp a partir del pedido y el producto.
	 * 
	 * @param pedido   {@link Edificio}
	 * @param producto {@link Edificio}
	 * @throws Exception En caso de error
	 */
	public void calcularPVP(Pedido pedido, Producto producto) throws Exception;

}
