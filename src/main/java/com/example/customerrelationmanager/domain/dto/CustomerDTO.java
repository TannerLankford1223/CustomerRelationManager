package com.example.customerrelationmanager.domain.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CustomerDTO {

    private long customerId;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email(message = "Email must be valid")
    @NotNull
    private String email;

    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$",
    message = "Please enter a valid phone number")
    @NotNull
    private String phone;

    private String notes;
}
