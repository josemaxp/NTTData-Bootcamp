package com.nttdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nttdata.repository.Client;
import com.nttdata.service.ClientServiceI;

@Controller
@RequestMapping("/api/v1")
public class ClientController {

	@Autowired
	private ClientServiceI clientService;

	/**
	 * Encontrar todos los clientes
	 * 
	 * @return
	 */
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public @ResponseBody List<Client> getAllClients() {
		List<Client> clientList = this.clientService.searchForAllClients();

		return clientList;
	}

	/**
	 * Insertar un cliente
	 * 
	 * @return
	 */

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String insertClient(Client client) {
		this.clientService.insertClient(client);

		return "Éxito";
	}

	/**
	 * /** Encontrar un cliente a partir de su nombre
	 * 
	 * @param name
	 * 
	 * @return
	 */
	@RequestMapping(value = "/clients", method = RequestMethod.GET, params = "name")
	public @ResponseBody String getClientByName(@RequestParam String name) {
		List<Client> clientList = clientService.searchByName(name);

		return "redirect:/clients?name=" + name;
	}
}
