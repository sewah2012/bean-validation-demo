package io.undefvar.beanvalidationdemo.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CustomerRequestDto(
        @NotNull(message = "Customer Name cannot be null")
        @NotBlank(message = "Customer Name must not be empty")
        String name,
        @Email(message = "Please provide a valid email address")
        String email,
        @NotNull(message = "Phone Number must not be null")
        String phone,
        @NotBlank(message = "customer address must not be empty")
        String address

) {
}
