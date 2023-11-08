package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.CreateHospitalDto;
import gdsc.backend.jpa.dto.CreatePatientDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping
    public void createPatient(@RequestBody CreatePatientDto createPatientDto) {
        patientService.createPatient(createPatientDto);
    }
}