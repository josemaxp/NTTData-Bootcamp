package com.nttdata.repository;

public class Pedido {
	private int id;
	private String destinatario;
	private String direccion;
	private boolean dentroPeninsula;

	public Pedido(int id, String destinatario, String direccion, boolean dentroPeninsula) {
		super();
		this.id = id;
		this.destinatario = destinatario;
		this.direccion = direccion;
		this.dentroPeninsula = dentroPeninsula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isDentroPeninsula() {
		return dentroPeninsula;
	}

	public void setDentroPeninsula(boolean dentroPeninsula) {
		this.dentroPeninsula = dentroPeninsula;
	}
	
	

}
