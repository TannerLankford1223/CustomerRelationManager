package com.example.customerrelationmanager.infrastructure.adapters;

import com.example.customerrelationmanager.domain.ports.spi.CustomerPersistencePort;
import com.example.customerrelationmanager.infrastructure.entity.Customer;
import com.example.customerrelationmanager.infrastructure.persistence.CustomerRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerJpaAdapter implements CustomerPersistencePort {

    private final CustomerRepository customerRepo;

    public CustomerJpaAdapter(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public Optional<Customer> getCustomer(int id) {
        return customerRepo.findById(id);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }

    @Override
    public List<Customer> searchCustomers(String search) {
        return customerRepo.findAllByFirstNameOrderByLastName(search);
    }
}
