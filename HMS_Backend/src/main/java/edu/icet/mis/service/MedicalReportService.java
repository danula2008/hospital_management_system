package edu.icet.mis.service;

import edu.icet.mis.dto.MedicalReport;
import java.util.List;

public interface MedicalReportService {
    Integer addMedicalReport(MedicalReport medicalReport);
    void deleteMedicalReport(Integer id);
    List<MedicalReport> getAllMedicalReports();
    MedicalReport getMedicalReportById(Integer id);
    List<MedicalReport> getMedicalReportByCategory(String category);
    List<MedicalReport> getMedicalReportByLabNo(Integer labNo);
    List<MedicalReport> getMedicalReportByPatientId(Integer patientId);
    List<MedicalReport> getMedicalReportByAdminId(Integer adminId);
}
