package io.undefvar.beanvalidationdemo.repositories;

import io.undefvar.beanvalidationdemo.dtos.CustomerRequestDto;
import io.undefvar.beanvalidationdemo.services.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerRequestDto addCustomer(CustomerRequestDto customerRequestDto) {
        //Save customer to your database
        return customerRequestDto;
    }
}
