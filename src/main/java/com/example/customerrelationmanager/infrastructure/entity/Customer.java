package com.example.customerrelationmanager.infrastructure.entity;

import com.example.customerrelationmanager.domain.dto.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private long customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private List<Note> notes;
}
