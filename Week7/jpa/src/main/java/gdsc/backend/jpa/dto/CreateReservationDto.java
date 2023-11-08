package gdsc.backend.jpa.dto;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
public class CreateReservationDto {
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDateTime time;
    private Long doctorId;
    private Long patientId;
}
