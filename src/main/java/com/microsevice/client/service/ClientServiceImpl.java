package com.microsevice.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.client.model.Clients;
import com.microservice.client.repository.ClientRepositoryInterfaces;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientServiceInterface {
	
	@Autowired
	ClientRepositoryInterfaces clienterepository;

	@Override
	public Flux<Clients> getAll() {
		
		return  clienterepository.findAll();
	}
	

	@Override
	public Mono<Clients> getById(String id) {
		
		return clienterepository.findById(id);
	}
	

}
