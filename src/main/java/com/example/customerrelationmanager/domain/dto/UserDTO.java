package com.example.customerrelationmanager.domain.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserDTO {

    private long userId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email(message = "Email must be valid")
    @NotNull
    private String email;

    @Size(min = 12, message = "Password must be at least 12 characters")
    @NotNull
    private String password;
}
