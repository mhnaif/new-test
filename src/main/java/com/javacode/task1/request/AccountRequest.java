package com.javacode.task1.request;

import com.javacode.task1.constant.AccountType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class AccountRequest {

    private Long customerNumber;
    @NotBlank
    private String currency;
    @NotNull
    private BigDecimal currentBalance;
    @NotNull
    private BigDecimal previousBalance;
    @NotNull
    private AccountType accountType;
    @NotNull
    private Long civilId;
}
