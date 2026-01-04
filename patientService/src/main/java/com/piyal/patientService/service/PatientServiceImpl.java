package com.piyal.patientService.service;

import com.piyal.patientService.dto.PatientRequestDTO;
import com.piyal.patientService.dto.PatientResponseDTO;
import com.piyal.patientService.mapper.PatientMapper;
import com.piyal.patientService.model.Patient;
import com.piyal.patientService.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.piyal.patientService.mapper.PatientMapper.mapToDTO;
import static com.piyal.patientService.mapper.PatientMapper.mapToPatient;


@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<PatientResponseDTO> getAllPatient() {
        List<Patient> listOfPatient=patientRepository.findAll();
        return listOfPatient.stream().map(PatientMapper::mapToDTO).toList();
    }

    @Override
    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {

        return mapToDTO(mapToPatient(patientRequestDTO));
    }
}
