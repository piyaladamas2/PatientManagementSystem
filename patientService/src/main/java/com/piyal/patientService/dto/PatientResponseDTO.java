package com.piyal.patientService.dto;

import lombok.Data;

@Data
public class PatientResponseDTO {
    private String name;
    private String email;
    private String address;
    private String date_of_birth;
    private String registration_date;
}
