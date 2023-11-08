package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.CreatePatientDto;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    @Transactional
    public void createPatient(CreatePatientDto createPatientDto) {
        patientRepository.save(new Patient(createPatientDto.getName()));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
