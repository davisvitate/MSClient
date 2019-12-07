package com.microsevice.client.service;
import org.springframework.stereotype.Service;

import com.microservice.client.model.Clients;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ClientServiceInterface {
	
	Flux<Clients> getAll();
	Mono<Clients> getById(String id);

}
