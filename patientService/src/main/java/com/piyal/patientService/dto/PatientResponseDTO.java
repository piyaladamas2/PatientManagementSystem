package com.piyal.patientService.dto;

import lombok.Data;

@Data
public class PatientResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String address;

}
