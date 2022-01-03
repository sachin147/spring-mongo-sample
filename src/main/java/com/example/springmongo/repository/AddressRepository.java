package com.example.springmongo.repository;

import com.example.springmongo.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {

}