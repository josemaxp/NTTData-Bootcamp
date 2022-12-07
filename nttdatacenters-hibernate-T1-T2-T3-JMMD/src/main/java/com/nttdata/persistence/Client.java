package com.nttdata.persistence;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Client extends AbstractEntity{
	
	@Id
	@Column(name="id_client")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="first_last_name")
	private String firstLastName;
	
	@Column(name="second_last_name")
	private String secondLastName;
	
	@Column(name="document_id", unique = true, nullable = false, length = 9)
	private String documentId;

	@Override
	public String toString() {
		return "Client [idClient=" + getId() + ", name=" + name + ", firstLastName=" + firstLastName
				+ ", secondLastName=" + secondLastName + ", dni=" + documentId;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "clientId")
	private List<Contract> contractList;
	
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

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	
	public List<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}
	

}
