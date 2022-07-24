package com.example.customerrelationmanager.domain.ports.api;

import com.example.customerrelationmanager.domain.dto.CustomerDTO;
import com.example.customerrelationmanager.domain.dto.Note;

import java.util.List;

public interface CustomerServicePort {

    List<CustomerDTO> getCustomers();

    void saveCustomer(CustomerDTO customer);

    CustomerDTO getCustomer(int id);

    void deleteCustomer(int id);

    List<CustomerDTO> searchCustomers(String searchName);

    void addNote(Note note);
    
    void updateNote(Note note);

    void deleteNote(Note note);
}
