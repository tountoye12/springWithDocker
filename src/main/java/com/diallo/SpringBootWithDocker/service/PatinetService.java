package com.diallo.SpringBootWithDocker.service;


import com.diallo.SpringBootWithDocker.model.Patient;
import com.diallo.SpringBootWithDocker.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatinetService {

    private PatientRepository patientRepository;

    public PatinetService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id).orElse(null);
    }
}
