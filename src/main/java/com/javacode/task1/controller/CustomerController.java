package com.javacode.task1.controller;
import com.javacode.task1.entity.Customer;
import com.javacode.task1.request.CustomerRequest;
import com.javacode.task1.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@Valid @RequestBody CustomerRequest request) {
     return customerService.addCustomer(request);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }

}
