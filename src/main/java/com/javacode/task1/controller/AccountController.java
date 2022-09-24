package com.javacode.task1.controller;


import com.javacode.task1.entity.Customer;
import com.javacode.task1.entity.CustomerAccount;
import com.javacode.task1.repository.AccountRepository;
import com.javacode.task1.request.AccountRequest;
import com.javacode.task1.request.CustomerRequest;
import com.javacode.task1.response.CustomerAccountResponse;
import com.javacode.task1.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public CustomerAccountResponse addAccount(@RequestBody AccountRequest request) {
        return accountService.addAccount(request);
    }

    @GetMapping
    public List<CustomerAccountResponse> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/ci")
    public List<CustomerAccountResponse> getAllCustomersByCivilId(@RequestParam(name = "civil_id") Long cId) {
        return accountService.getAllByCustomerByCivilId(cId);
    }
}
