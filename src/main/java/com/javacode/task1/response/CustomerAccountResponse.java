package com.javacode.task1.response;



import com.javacode.task1.entity.Customer;
import com.javacode.task1.constant.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccountResponse {

    private Long accountNumber;
    private String currency;
    private BigDecimal currentBalance;
    private BigDecimal previousBalance;
    private AccountType accountType;
    private CustomerResponse customer;
}
