package edu.icet.mis.service.impl;

import edu.icet.mis.dto.Patient;
import edu.icet.mis.entity.PatientEntity;
import edu.icet.mis.repository.PatientDao;
import edu.icet.mis.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientDao repository;
    private final ModelMapper mapper;

    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patientList = new ArrayList<>();
        repository.findAll().forEach(patientEntity -> patientList.add(mapper.map(patientEntity, Patient.class)));
        return patientList;
    }

    @Override
    public Integer addPatient(Patient patient) {
        return repository.save(mapper.map(patient, PatientEntity.class)).getId();
    }

    @Override
    public void deletePatient(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Patient getPatientById(Integer id) {
        return mapper.map(repository.findById(id), Patient.class);
    }

    @Override
    public List<Patient> getPatientByName(String name) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByNameLike(name+"%")) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientByContact(String contact) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByContactLike(contact+"%")) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientByNic(String nic) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByNicLike(nic+"%")) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientByBloodGroup(String bloodGroup) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByBloodGroup(bloodGroup)) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientByCategory(String category) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByCategory(category)) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }

    @Override
    public List<Patient> getPatientByAddress(String address) {
        List<Patient> patientList = new ArrayList<>();
        for (PatientEntity patientEntity : repository.findByAddressLike(address+"%")) {
            patientList.add(mapper.map(patientEntity, Patient.class));
        }
        return patientList;
    }



}
