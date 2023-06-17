package io.undefvar.beanvalidationdemo.services;

import io.undefvar.beanvalidationdemo.dtos.CustomerRequestDto;

public interface CustomerService {
    CustomerRequestDto addCustomer(CustomerRequestDto customerRequestDto);
}
