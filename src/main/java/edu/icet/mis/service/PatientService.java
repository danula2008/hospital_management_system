package edu.icet.mis.service;

import edu.icet.mis.dto.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Integer addPatient(Patient patient);
    void deletePatient(Integer id);
    Patient getPatientById(Integer id);
    List<Patient> getPatientByName(String name);
    List<Patient> getPatientByContact(String contact);
    List<Patient> getPatientByNic(String nic);
    List<Patient> getPatientByBloodGroup(String bloodGroup);
    List<Patient> getPatientByCategory(String category);
    List<Patient> getPatientByAddress(String address);
}
