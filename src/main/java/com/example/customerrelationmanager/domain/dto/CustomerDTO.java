package com.example.customerrelationmanager.domain.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CustomerDTO {

    private long customerId;

    @NotEmpty(message = "Customer's first name can't be empty")
    private String firstName;

    @NotEmpty(message = "Customer's last name can't be empty")
    private String lastName;

    @Email(message = "Customer's email must be valid")
    @NotEmpty(message = "Customer's email can't be empty")
    private String email;

    @Pattern(regexp = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$",
    message = "Customer's phone number must be valid")
    @NotEmpty(message = "Customer's phone number can't be empty")
    private String phone;

    private String notes;
}
