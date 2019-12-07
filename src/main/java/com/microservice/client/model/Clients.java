package com.microservice.client.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
//import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Document(collection = "clients")
public class Clients {

@Id
private String id;

@Field("name")
private String name;

@Field("lastname")
private String lastName;
//@DateTimeFormat(pattern = "yyyy-MM-dd")
//private Date dateBir;

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

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
