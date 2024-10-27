package edu.icet.mis.service.impl;

import edu.icet.mis.dto.MedicalReport;
import edu.icet.mis.entity.MedicalReportEntity;
import edu.icet.mis.repository.MedicalReportDao;
import edu.icet.mis.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicalReportServiceImpl implements MedicalReportService {

    final ModelMapper mapper;
    final MedicalReportDao repository;

    @Override
    public Integer addMedicalReport(MedicalReport medicalReport) {
        return repository.save(mapper.map(medicalReport, MedicalReportEntity.class)).getId();
    }

    @Override
    public void deleteMedicalReport(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<MedicalReport> getAllMedicalReports() {
        return repository.findAll().stream().map(medicalReport -> mapper.map(medicalReport, MedicalReport.class)).toList();
    }

    @Override
    public MedicalReport getMedicalReportById(Integer id) {
        return mapper.map(repository.findById(id), MedicalReport.class);
    }

    @Override
    public List<MedicalReport> getMedicalReportByCategory(String category) {
        return repository.findByCategory(category).stream().map(medicalReport -> mapper.map(medicalReport, MedicalReport.class)).toList();
    }

    @Override
    public List<MedicalReport> getMedicalReportByLabNo(Integer labNo) {
        return repository.findByLabNo(labNo).stream().map(medicalReport -> mapper.map(medicalReport, MedicalReport.class)).toList();
    }

    @Override
    public List<MedicalReport> getMedicalReportByPatientId(Integer patientId) {
        return repository.findByPatientId(patientId).stream().map(medicalReport -> mapper.map(medicalReport, MedicalReport.class)).toList();
    }

    @Override
    public List<MedicalReport> getMedicalReportByAdminId(Integer adminId) {
        return repository.findByAdminId(adminId).stream().map(medicalReport -> mapper.map(medicalReport, MedicalReport.class)).toList();
    }
}
