package gdsc.backend.jpa.controller;

import gdsc.backend.jpa.dto.CreateMedicalDepartmentDto;
import gdsc.backend.jpa.dto.CreateReservationDto;
import gdsc.backend.jpa.entity.MedicalDepartment;
import gdsc.backend.jpa.entity.Reservation;
import gdsc.backend.jpa.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public void createReservation(@RequestBody CreateReservationDto createReservationDto) {
        reservationService.createReservation(createReservationDto);
    }
}
