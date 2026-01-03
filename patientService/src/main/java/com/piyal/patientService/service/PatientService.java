package com.piyal.patientService.service;

import com.piyal.patientService.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {

    List<PatientResponseDTO> getAllPatient();
}
