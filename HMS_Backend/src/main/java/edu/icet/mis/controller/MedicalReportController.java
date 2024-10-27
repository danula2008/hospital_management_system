package edu.icet.mis.controller;

import edu.icet.mis.dto.MedicalReport;
import edu.icet.mis.service.MedicalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/medical-report")
@RequiredArgsConstructor
public class MedicalReportController {

    private final MedicalReportService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addMedicalReport(@RequestBody MedicalReport medicalReport){
        return "Id:" + service.addMedicalReport(medicalReport) + " Medical report added successfully.";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteMedicalReport(@PathVariable Integer id){
        service.deleteMedicalReport(id);
        return "Deleted Successfully.";
    }
    
    @GetMapping("/get/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<MedicalReport> getAllMedicalRecords(){
        return service.getAllMedicalReports();
    }

    @GetMapping("/get/id/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public MedicalReport getMedicalReportById(@PathVariable Integer id){
        return service.getMedicalReportById(id);
    }

    @GetMapping("/get/category/{category}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<MedicalReport> getMedicalReportByCategory(@PathVariable String category){
        return service.getMedicalReportByCategory(category);
    }

    @GetMapping("/get/lab-no/{labNo}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<MedicalReport> getMedicalReportByLabNo(@PathVariable Integer labNo){
        return service.getMedicalReportByLabNo(labNo);
    }

    @GetMapping("/get/patient-id/{patientId}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<MedicalReport> getMedicalReportByPatientId(@PathVariable Integer patientId){
        return service.getMedicalReportByPatientId(patientId);
    }

    @GetMapping("/get/admin-id/{adminId}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<MedicalReport> getMedicalReportByAdminId(@PathVariable Integer adminId){
        return service.getMedicalReportByAdminId(adminId);
    }
}
