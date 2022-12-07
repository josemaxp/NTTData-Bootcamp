package com.nttdata.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.repository.Pedido;
import com.nttdata.repository.Producto;

@Primary
@Qualifier("Península")
@Service
public class ProductoServcicePeninsulaImpl implements ProductoServiceI {
	final Double impuesto21 = 0.21;

	@Override
	public void calcularPVP(Pedido pedido, Producto producto) throws Exception {

		/**
		 * Así lo haría en una única clase, pero por usar el método @Qualifier
		 * y @Primary y aplicar lo aprendido haré una clase servicio para 21 y otra para
		 * 4, como en el taller 1.
		 */

		/*
		 * if (pedido != null && producto != null) { Double precioPVP = null;
		 * 
		 * if (pedido.isDentroPeninsula()) { precioPVP = producto.getPrecioPVP() +
		 * (producto.getPrecioPVP() * impuesto21); producto.setPrecioPVP(precioPVP); }
		 * else { precioPVP = producto.getPrecioPVP() + (producto.getPrecioPVP() *
		 * impuesto4); producto.setPrecioPVP(precioPVP); }
		 * 
		 * producto.setPrecioPVP(precioPVP);
		 */

		Double precioPVP = producto.getPrecioSinImpuestos() + (producto.getPrecioSinImpuestos() * impuesto21);
		producto.setPrecioPVP(precioPVP);
		
		System.out.println("PVP de "+ producto.getNombre()+" dentro de la Península: "+precioPVP+"€");

	}

}
