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
@Table(name = "MedicalReport")
public class MedicalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String category;
    private String pdfSrc;
    private LocalDateTime dateTime;
    private Integer patientId;
    private Integer adminId;
    private Integer labNo;
}
