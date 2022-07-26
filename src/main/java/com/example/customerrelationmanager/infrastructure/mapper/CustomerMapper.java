package com.example.customerrelationmanager.infrastructure.mapper;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;
import com.example.customerrelationmanager.infrastructure.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer customerDTOToCustomer(CustomerDTO customerDTO);

    CustomerDTO customerToCustomerDTO(Customer customer);
}
