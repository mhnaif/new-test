package com.javacode.task1.service;


import com.javacode.task1.entity.Customer;
import com.javacode.task1.repository.CustomerRepository;
import com.javacode.task1.request.CustomerRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer addCustomer(CustomerRequest request) {
        Customer customer = new Customer();
        customer.setCivilId(request.getCivilId());
        customer.setDateOfBirth(request.getDateOfBirth());
        customer.setFullName(request.getFullName());
        customer.setMobileNumber(request.getMobileNumber());
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("customer not found"));
    }

}
