package com.piyal.patientService.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatientRequestDTO {

    @NotBlank(message = "Name is required")
    @Size(max=100,message = "Name can not exceed 100 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Date of Birth is required")
    private String date_Of_birth;

    @NotNull(message = "Registered Date is required")
    private String registration_date;
}
