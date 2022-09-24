package com.javacode.task1.repository;

import com.javacode.task1.entity.CustomerAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<CustomerAccount, Long> {

    //    @Query(value = "select ca.* from customer_account ca, customer c " +
//            "where 1 = 1 and ca.customer_number = c.customer_number " +
//            "and c.civil_id = :civilId", nativeQuery = true)
    @Query(value = "select ca from CustomerAccount ca, Customer c " +
            "where 1 = 1 and ca.customer.customerNumber = c.customerNumber " +
            "and c.civilId = :civilId")
    List<CustomerAccount> findByCivilId(Long civilId);


    List<CustomerAccount> findByCustomer_civilId(Long customerNumber);
}
