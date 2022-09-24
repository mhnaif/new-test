package com.javacode.task1.service;

import com.javacode.task1.entity.Customer;
import com.javacode.task1.entity.CustomerAccount;
import com.javacode.task1.mapper.CustomerAccountMapper;
import com.javacode.task1.repository.AccountRepository;
import com.javacode.task1.repository.CustomerRepository;
import com.javacode.task1.request.AccountRequest;
import com.javacode.task1.response.CustomerAccountResponse;
import com.javacode.task1.response.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
    private final CustomerAccountMapper mapper;
    private final CustomerAccountMapper MAPPER = Mappers.getMapper(CustomerAccountMapper.class);

    public CustomerAccountResponse addAccount(AccountRequest request) {

        Customer customer
                = customerRepository.findById(request.getCivilId())
                .orElseThrow(()-> new IllegalArgumentException("not found"));

        CustomerAccount customerAccount = mapper.requestToCustomerAccount(request, customer);

        return mapper.customerAccountToResponse(accountRepository.save(customerAccount));
    }

    public List<CustomerAccountResponse> getAllAccounts(){
        return StreamSupport.stream(accountRepository.findAll().spliterator(),false)
                .map(mapper::customerAccountToResponse)
                .collect(Collectors.toList());
    }

    public List<CustomerAccountResponse> getAllByCustomerByCivilId(Long civilId){
        return accountRepository.findByCustomer_civilId(civilId)
                .stream()
                .map(mapper::customerAccountToResponse)
                .collect(Collectors.toList());
    }
}
