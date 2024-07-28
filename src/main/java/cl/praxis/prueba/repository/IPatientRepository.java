package cl.praxis.prueba.repository;

import cl.praxis.prueba.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepository extends JpaRepository<Patient, Long> {
}
