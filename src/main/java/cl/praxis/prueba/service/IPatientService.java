package cl.praxis.prueba.service;

import cl.praxis.prueba.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface IPatientService {
    List<Patient> getAllPacients();
    Patient savePacients(Patient patient);
    Optional<Patient> findPatientById(Long id);
}
