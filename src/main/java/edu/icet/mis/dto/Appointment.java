package edu.icet.mis.dto;

import lombok.*;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    private Integer id;
    private String type;
    private String description;
    private String status;
    private Integer roomNumber;
    private Integer queNumber;
    private String qr;
//    @JsonProperty("dateTime")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDateTime dateTime;

    private Integer patientId;
    private Integer adminId;
}
