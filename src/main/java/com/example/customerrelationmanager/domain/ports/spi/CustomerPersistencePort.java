package com.example.customerrelationmanager.domain.ports.spi;

import com.example.customerrelationmanager.infrastructure.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerPersistencePort {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Optional<Customer> getCustomer(int id);

    void deleteCustomer(int id);

    List<Customer> searchCustomers(String search);
}
