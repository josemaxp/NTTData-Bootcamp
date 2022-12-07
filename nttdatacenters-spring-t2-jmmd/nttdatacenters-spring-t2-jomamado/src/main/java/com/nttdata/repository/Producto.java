package com.nttdata.repository;

public class Producto {
	private int id;
	private String nombre;
	private Double precioPVP;
	private Double precioSinImpuestos;

	public Producto(int id, String nombre, Double precioPVP, Double precioSinImpuestos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioPVP = precioPVP;
		this.precioSinImpuestos = precioSinImpuestos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecioPVP() {
		return precioPVP;
	}

	public void setPrecioPVP(Double precioPVP) {
		this.precioPVP = precioPVP;
	}

	public Double getPrecioSinImpuestos() {
		return precioSinImpuestos;
	}

	public void setPrecioSinImpuestos(Double precioSinImpuestos) {
		this.precioSinImpuestos = precioSinImpuestos;
	}

}
