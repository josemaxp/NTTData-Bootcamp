package com.nttdata.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENT")
public class Client {
	@Id
	@Column(name = "id_client")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="firstLastName")
	private String firstLastName;
	
	@Column(name="secondLastName")
	private String secondLastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="document")
	private String document;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getfirstLastName() {
		return firstLastName;
	}

	public void setfirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", firstLastName=" + firstLastName + ", secondLastName="
				+ secondLastName + ", age=" + age + ", document=" + document + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

}
