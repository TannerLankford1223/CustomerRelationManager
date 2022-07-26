package com.example.customerrelationmanager.infrastructure.persistence;

import com.example.customerrelationmanager.infrastructure.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByFirstName(String searchName);

    List<Customer> findAllByLastName(String searchName);
}
