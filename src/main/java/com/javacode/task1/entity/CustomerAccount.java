package com.javacode.task1.entity;



import com.javacode.task1.constant.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customer_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long accountNumber;
    @Column(name = "currency")
    private String currency;
    @Column(name = "current_balance")
    private BigDecimal currentBalance;
    @Column(name = "previous_balance")
    private BigDecimal previousBalance;
    @Column(name = "account_type")
    private AccountType accountType;
    @ManyToOne(targetEntity = Customer.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="customer_number")
    private Customer customer;
}
