package edu.icet.mis.repository;

import edu.icet.mis.dto.MedicalReport;
import edu.icet.mis.entity.MedicalReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedicalReportDao extends JpaRepository<MedicalReportEntity, Integer> {
    List<MedicalReport> findByCategory(String category);
    List<MedicalReport> findByLabNo(Integer labNo);
    List<MedicalReport> findByPatientId(Integer patientId);
    List<MedicalReport> findByAdminId(Integer adminId);
}
