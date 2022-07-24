package com.example.customerrelationmanager.domain.ports.spi;

import com.example.customerrelationmanager.infrastructure.entity.Customer;

import java.util.List;

public interface CustomerPersistencePort {

    List<Customer> getCustomers();

    void saveCustomer(Customer customer);

    Customer getCustomer(int id);

    void deleteCustomer(int id);

    List<Customer> searchCustomers(String search);
}
