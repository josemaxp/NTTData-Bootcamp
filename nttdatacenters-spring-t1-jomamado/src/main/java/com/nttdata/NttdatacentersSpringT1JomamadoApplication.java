package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nttdata.repository.Edificio;
import com.nttdata.service.EdificioServiceI;

@SpringBootApplication
public class NttdatacentersSpringT1JomamadoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext cx = SpringApplication.run(NttdatacentersSpringT1JomamadoApplication.class,
				args);
		cx.close();

	}

	@Autowired
	EdificioServiceI edificioService;
	
	@Qualifier("Oficinas")
	@Autowired
	EdificioServiceI edificioServiceOficinas;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iniciando programa...");

		System.out.println("Creando edificios...");

		Edificio edificio1 = edificioService.createEdificio(6);
		Edificio edificio2 = edificioService.createEdificio(3);
		Edificio oficina1 = edificioServiceOficinas.createEdificio(2);

		System.out.println("Añadiendo personas...");

		edificioService.agregarPersonaEdificioPlanta(edificio1, 1, "José Manuel Marín");
		edificioService.agregarPersonaEdificioPlanta(edificio1, 3, "Luis Pérez Sáchez");
		edificioServiceOficinas.agregarPersonaEdificioPlanta(oficina1, 1, "José Manuel Marín");

		System.out.println("Buscando personas...");

		edificioService.buscarPersona(edificio1, "Ana");
		edificioService.buscarPersona(edificio1, "José Manuel Marín");

		System.out.println("Mostrando propietarios...");

		edificioService.mostrarPropietarios(edificio1);
		edificioService.mostrarPropietarios(edificio2);
		
		System.out.println("Mostrando propietarios de oficinas...");

		edificioServiceOficinas.mostrarPropietarios(oficina1);

		System.out.println("Cerrando programa...");

	}

}
