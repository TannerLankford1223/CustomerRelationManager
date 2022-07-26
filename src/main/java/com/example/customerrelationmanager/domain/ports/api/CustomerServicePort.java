package com.example.customerrelationmanager.domain.ports.api;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;

import java.util.List;

public interface CustomerServicePort {

    List<CustomerDTO> getCustomers();

    void saveCustomer(CustomerDTO customer);

    CustomerDTO getCustomer(int id);

    void deleteCustomer(int id);

    List<CustomerDTO> searchCustomers(String searchName);
}
