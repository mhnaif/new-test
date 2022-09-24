package com.javacode.task1.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CustomerResponse {

    private Long customerNumber;
    private Long civilId;
    private LocalDate dateOfBirth;
    private String fullName;
    private String mobileNumber;
}
