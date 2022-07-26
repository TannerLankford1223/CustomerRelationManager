package com.example.customerrelationmanager.domain.service;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;
import com.example.customerrelationmanager.domain.ports.api.CustomerServicePort;
import com.example.customerrelationmanager.domain.ports.spi.CustomerPersistencePort;
import com.example.customerrelationmanager.infrastructure.entity.Customer;
import com.example.customerrelationmanager.infrastructure.mapper.CustomerMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService implements CustomerServicePort {

    private final CustomerPersistencePort customerRepo;

    private final CustomerMapper mapper;

    public CustomerService(CustomerPersistencePort customerRepo, CustomerMapper mapper) {
        this.customerRepo = customerRepo;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerDTO> getCustomers() {
        return customerRepo.getCustomers().stream()
                .map(mapper::customerToCustomerDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void saveCustomer(CustomerDTO customer) {
        customerRepo.saveCustomer(mapper.customerDTOToCustomer(customer));
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        Optional<Customer> customerOpt = customerRepo.getCustomer(id);

        if (customerOpt.isPresent()) {
            return mapper.customerToCustomerDTO(customerOpt.get());
        }

        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "customer not found");
    }

    @Override
    @Transactional
    public void deleteCustomer(int id) {
        customerRepo.deleteCustomer(id);
    }

    @Override
    public List<CustomerDTO> searchCustomers(String searchName) {
        return customerRepo.searchCustomers(searchName).stream()
                .map(mapper::customerToCustomerDTO).collect(Collectors.toList());
    }
}
