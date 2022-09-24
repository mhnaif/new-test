package com.javacode.task1.mapper;

import com.javacode.task1.entity.Customer;
import com.javacode.task1.entity.CustomerAccount;
import com.javacode.task1.request.AccountRequest;
import com.javacode.task1.response.CustomerAccountResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerAccountMapper {

    CustomerAccountResponse customerAccountToResponse(CustomerAccount customerAccount);

    CustomerAccount requestToCustomerAccount(AccountRequest request);

    CustomerAccount requestToCustomerAccount(AccountRequest request, Customer customer);
}
