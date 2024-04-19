package com.diallo.SpringBootWithDocker.repository;


import com.diallo.SpringBootWithDocker.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
