package com.example.customerrelationmanager.domain.service;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;
import com.example.customerrelationmanager.domain.ports.api.CustomerServicePort;
import com.example.customerrelationmanager.domain.ports.spi.CustomerPersistencePort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServicePort {

    private final CustomerPersistencePort customerRepo;

    public CustomerService(CustomerPersistencePort customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<CustomerDTO> getCustomers() {
        return null;
    }

    @Override
    public void saveCustomer(CustomerDTO customer) {

    }

    @Override
    public CustomerDTO getCustomer(int id) {
        return null;
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public List<CustomerDTO> searchCustomers(String searchName) {
        return null;
    }
}
