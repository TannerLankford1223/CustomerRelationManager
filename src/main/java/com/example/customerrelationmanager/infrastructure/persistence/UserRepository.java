package com.example.customerrelationmanager.infrastructure.persistence;

import com.example.customerrelationmanager.infrastructure.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
}
