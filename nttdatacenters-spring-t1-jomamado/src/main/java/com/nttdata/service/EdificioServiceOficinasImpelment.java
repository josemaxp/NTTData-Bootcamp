package com.nttdata.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nttdata.repository.Edificio;

@Qualifier("Oficinas")
@Service
public class EdificioServiceOficinasImpelment implements EdificioServiceI {

	@Override
	public Edificio createEdificio(int numPlantas) throws Exception {
		Edificio edificio = new Edificio(numPlantas + 1);
		edificio.getPlantas()[0] = "PARKING";

		return edificio;
	}

	@Override
	public void agregarPersonaEdificioPlanta(Edificio edificio, int numPlanta, String nombreApellidos)
			throws Exception {
		int total = (numPlanta + 1);
		edificio.getPlantas()[total] = nombreApellidos;

	}

	@Override
	public void buscarPersona(Edificio edificio, String nombreApellidos) throws Exception {
		String result = nombreApellidos + " no ha sido encontrado/a.";

		for (int i = 0; i < edificio.getPlantas().length; i++) {
			if (edificio.getPlantas()[i] != null) {
				if (edificio.getPlantas()[i].equals(nombreApellidos)) {
					result = nombreApellidos + " se encuentra en la planta " + i + ".";
					break;
				}
			}
		}

		System.out.println(result);

	}

	@Override
	public void mostrarPropietarios(Edificio edificio) throws Exception {
		String result = "";

		for (int i = 0; i < edificio.getPlantas().length; i++) {
			if (edificio.getPlantas()[i] != null) {
				result = "Propietario de la planta " + i + ": " + edificio.getPlantas()[i] + ".";
				System.out.println(result);
			}
		}

		if (result.equals("")) {
			result = "Este edificio no tiene ningún propietario aún.";
			System.out.println(result);
		}

	}

}
