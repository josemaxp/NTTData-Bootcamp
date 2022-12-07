package com.nttdata.bootcamp.mybootcampproject.model;

public class DTO {

	public String code;

	public String mesage;

	public DTO(String code, String mesage) {
		super();
		this.code = code;
		this.mesage = mesage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

}
