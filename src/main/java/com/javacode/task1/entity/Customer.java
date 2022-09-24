package com.javacode.task1.entity;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerNumber;
    @Column(name = "civil_id")
    private Long civilId;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "mobile_number")
    private String mobileNumber;


}
