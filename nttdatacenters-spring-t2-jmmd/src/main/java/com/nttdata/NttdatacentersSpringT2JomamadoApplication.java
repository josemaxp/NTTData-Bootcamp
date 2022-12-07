package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nttdata.repository.Pedido;
import com.nttdata.repository.Producto;
import com.nttdata.service.ProductoServiceI;

@SpringBootApplication
public class NttdatacentersSpringT2JomamadoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx = SpringApplication.run(NttdatacentersSpringT2JomamadoApplication.class,
				args);
		cx.close();
	}

	@Autowired
	ProductoServiceI productoPeninsula;

	@Qualifier("Islas")
	@Autowired
	ProductoServiceI productoIslas;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iniciando programa...");

		System.out.println("Creando productos...");

		Producto producto1 = new Producto(1, "PlayStation 5", null, 450.0);
		Producto producto2 = new Producto(2, "PlayStation 5 Digital Edition", null, 250.0);

		System.out.println("Creando pedidos...");

		Pedido pedido1 = new Pedido(1, "José Manuel Marín", "Villamartín", true);
		Pedido pedido2 = new Pedido(2, "Ana Pérez", "Ceuta", false);

		System.out.println("Calculando PVP...");

		productoPeninsula.calcularPVP(pedido1, producto1);
		productoPeninsula.calcularPVP(pedido2, producto2);

		System.out.println("Cerrando programa...");

	}

}
