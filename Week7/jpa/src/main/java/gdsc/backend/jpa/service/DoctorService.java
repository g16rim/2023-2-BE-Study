package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.CreateDoctorDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public void createDoctor(CreateDoctorDto createDoctorDto) {
        doctorRepository.save(new Doctor(createDoctorDto.getName()));
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
