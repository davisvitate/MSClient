package com.microservice.client.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.client.model.Clients;

@Repository
public interface ClientRepositoryInterfaces extends ReactiveMongoRepository<Clients, String> {

}
