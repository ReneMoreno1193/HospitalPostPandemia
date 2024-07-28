package cl.praxis.prueba.service.impl;

import cl.praxis.prueba.entity.Patient;
import cl.praxis.prueba.repository.IPatientRepository;
import cl.praxis.prueba.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    private IPatientRepository patientRepository;
    @Override
    public List<Patient> getAllPacients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient savePacients(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> findPatientById(Long id) {
        return patientRepository.findById(id);
    }
}
