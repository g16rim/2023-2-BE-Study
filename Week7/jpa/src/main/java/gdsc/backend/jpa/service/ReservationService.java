package gdsc.backend.jpa.service;

import gdsc.backend.jpa.dto.CreateReservationDto;
import gdsc.backend.jpa.entity.Doctor;
import gdsc.backend.jpa.entity.Patient;
import gdsc.backend.jpa.entity.Reservation;
import gdsc.backend.jpa.repository.DoctorRepository;
import gdsc.backend.jpa.repository.PatientRepository;
import gdsc.backend.jpa.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public void createReservation(CreateReservationDto createReservationDto) {
        Doctor doctor = doctorRepository.findById(createReservationDto.getDoctorId())
                .orElseThrow(RuntimeException::new);
        Patient patient = patientRepository.findById(createReservationDto.getPatientId())
                .orElseThrow(RuntimeException::new);
        reservationRepository.save(new Reservation(null, doctor, patient));
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
