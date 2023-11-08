package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.CreateHospitalDto;
import gdsc.backend.jpa.entity.Hospital;
import gdsc.backend.jpa.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    @Transactional
    public void createHospital(CreateHospitalDto createHospitalDto) {
        hospitalRepository.save(new Hospital(createHospitalDto.getName()));
    }

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital getHospitalByName(String name) {
        return hospitalRepository.findByName(name);
    }
}
