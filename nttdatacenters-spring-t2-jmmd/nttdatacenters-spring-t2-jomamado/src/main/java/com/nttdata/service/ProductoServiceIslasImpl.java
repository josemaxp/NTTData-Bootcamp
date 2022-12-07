package com.nttdata.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nttdata.repository.Pedido;
import com.nttdata.repository.Producto;

@Qualifier("Islas")
@Service
public class ProductoServiceIslasImpl implements ProductoServiceI {
	final Double impuesto4 = 0.04;

	@Override
	public void calcularPVP(Pedido pedido, Producto producto) throws Exception {
		Double precioPVP = producto.getPrecioSinImpuestos() + (producto.getPrecioSinImpuestos() * impuesto4);
		producto.setPrecioPVP(precioPVP);

		System.out.println("PVP de "+ producto.getNombre()+" fuera de la Península: " + precioPVP+"€");

	}

}
