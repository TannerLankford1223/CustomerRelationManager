package com.example.customerrelationmanager.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Note {

    private final LocalDateTime timestamp = LocalDateTime.now();

    @NotNull
    private String message;

    public Note(String message) {
        this.message = message;
    }
}
