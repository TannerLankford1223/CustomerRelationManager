package com.example.customerrelationmanager.infrastructure.persistence;

import com.example.customerrelationmanager.infrastructure.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
