package io.undefvar.beanvalidationdemo.web;

import io.undefvar.beanvalidationdemo.dtos.CustomerRequestDto;
import io.undefvar.beanvalidationdemo.services.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    ResponseEntity<?> addCustomer(@RequestBody @Valid() CustomerRequestDto customerRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customerRequestDto));
    }
}
