package com.piyal.patientService.mapper;

import com.piyal.patientService.dto.PatientRequestDTO;
import com.piyal.patientService.dto.PatientResponseDTO;
import com.piyal.patientService.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO mapToDTO(Patient patient){
        PatientResponseDTO patientResponseDTO=new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setEmail(patient.getEmail());
        return patientResponseDTO;
    }

    public static Patient mapToPatient(PatientRequestDTO patientRequestDTO){
        Patient patient=new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDate_of_birth(LocalDate.parse(patientRequestDTO.getDate_Of_birth()));
        patient.setRegistration_date(LocalDate.parse(patientRequestDTO.getRegistration_date()));
        return  patient;
    }
}
