package com.diallo.SpringBootWithDocker.controller;

import com.diallo.SpringBootWithDocker.model.Patient;
import com.diallo.SpringBootWithDocker.service.PatinetService;
import jakarta.persistence.GeneratedValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {


    private PatinetService patinetService;

    public PatientController(PatinetService patinetService) {
        this.patinetService = patinetService;
    }

    @PostMapping("/save")
    public ResponseEntity<Patient> save(@RequestBody Patient patient) {
        return ResponseEntity.ok(patinetService.addPatient(patient));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable Integer id) {
        return ResponseEntity.ok(patinetService.getPatientById(id));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Patient>> getPatients() {
        return ResponseEntity.ok(patinetService.getAllPatient());
    }
}
