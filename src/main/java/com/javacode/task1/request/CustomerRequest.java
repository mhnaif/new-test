package com.javacode.task1.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Data
public class CustomerRequest {


    @NotNull
    private Long civilId;
    @NotNull
    private LocalDate dateOfBirth;
    @NotBlank
    private String fullName;
    @NotBlank
    private String mobileNumber;
}
