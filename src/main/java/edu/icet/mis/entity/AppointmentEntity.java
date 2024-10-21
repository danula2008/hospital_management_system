package edu.icet.mis.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Appointment")
public class AppointmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String description;
    private String status;
    private Integer roomNumber;
    private Integer queNumber;
    private String qr;
    private LocalDateTime dateTime;

    private Integer patientId;
    private Integer adminId;
}
