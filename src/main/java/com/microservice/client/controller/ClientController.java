package com.microservice.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.client.model.Clients;
import com.microsevice.client.service.ClientServiceInterface;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController {
	//ClientService clienteservicio = new ClientService();
	
	@Autowired
	ClientServiceInterface clienteservicios;
	
	@GetMapping("/all")
	public Flux<Clients> getAll(){
		return clienteservicios.getAll();
	}
	
	@GetMapping("/client/{id}")
	public Mono<Clients> getById(@PathVariable String id){
		return clienteservicios.getById(id);
		
	}
	

}
