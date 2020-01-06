package com.microservice.Clients.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "client")
//@JsonPropertyOrder({"id","name","lastname","dni","numcuentaahorro","cuentacredito"})
public class Client {
	@Id
	private String id;

	@Field("name")
	private String name;

	@Field("lastname")
	private String lastname;

	@Field("dni")
	private String dni;

	@Field("type")
	private String type;

	@Field("num_current")
	private String num_current;

	@Field("num_ahorro")
	private String num_ahorro;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getNum_current() {
		return num_current;
	}


	public void setNum_current(String num_current) {
		this.num_current = num_current;
	}


	public String getNum_ahorro() {
		return num_ahorro;
	}


	public void setNum_ahorro(String num_ahorro) {
		this.num_ahorro = num_ahorro;
	}

	
	

}
