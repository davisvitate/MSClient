package com.microservice.Clients.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "current")
public class CurrentAccount {

	@Id
	private String id;

	private String num;
	
	private String typecount="current";

	private Double monto;
	
	private String bank;
	
	private String codBank;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTypecount() {
		return typecount;
	}

	public void setTypecount(String typecount) {
		this.typecount = typecount;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCodBank() {
		return codBank;
	}

	public void setCodBank(String codBank) {
		this.codBank = codBank;
	}
	
	

	
	
	
	
	

	
}
