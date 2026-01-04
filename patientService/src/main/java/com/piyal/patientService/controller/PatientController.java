package com.piyal.patientService.controller;


import com.piyal.patientService.dto.PatientRequestDTO;
import com.piyal.patientService.dto.PatientResponseDTO;
import com.piyal.patientService.model.Patient;
import com.piyal.patientService.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient-service")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public ResponseEntity<List<PatientResponseDTO>> getPatients(){
        List<PatientResponseDTO> patient1=patientService.getAllPatient();
        return ResponseEntity.ok().body(patient1);
    }

    @PostMapping("/add-patient")
    public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody PatientRequestDTO patientRequestDTO){
        PatientResponseDTO patientResponseDTO=patientService.createPatient(patientRequestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
    }
}
