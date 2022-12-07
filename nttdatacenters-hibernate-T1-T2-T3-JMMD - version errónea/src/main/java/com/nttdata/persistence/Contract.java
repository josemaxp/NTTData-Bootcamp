package com.nttdata.persistence;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Contract")
public class Contract extends AbstractEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_contract")
	private Long id;

	@Column(name = "validity_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date validitDate;

	@Column(name = "caducity_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date caducityDate;

	@Column(name = "monthly_price")
	@Digits(fraction = 2, integer = 5)
	private Double monthlyPrice;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client clientId;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Date getValiditDate() {
		return validitDate;
	}

	public void setValiditDate(Date validitDate) {
		this.validitDate = validitDate;
	}

	public Date getCaducityDate() {
		return caducityDate;
	}

	public void setCaducityDate(Date caducityDate) {
		this.caducityDate = caducityDate;
	}

	public Double getMonthlyPrice() {
		return monthlyPrice;
	}

	public void setMonthlyPrice(Double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}

	public Client getClientId() {
		return clientId;
	}

	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "Contract [id=" + id + ", validitDate=" + validitDate + ", caducityDate=" + caducityDate
				+ ", monthlyPrice=" + monthlyPrice + ", clientId=" + clientId + "]";
	}
	
	

}
