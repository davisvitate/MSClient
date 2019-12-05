package com.microservice.client.model;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
@Document(collection = "clients")
public class Clients {
@NotBlank	
private String id;
@NotBlank	
private String name;
@NotBlank	
private String lastName;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date dateBir;
}
