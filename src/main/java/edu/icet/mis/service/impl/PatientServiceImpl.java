package edu.icet.mis.service.impl;

import edu.icet.mis.dto.Patient;
import edu.icet.mis.entity.PatientEntity;
import edu.icet.mis.repository.PatientDao;
import edu.icet.mis.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientDao repository;
    private final ModelMapper mapper;

    @Override
    public List<Patient> getAllPatients() {
        return repository.findAll().stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
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
        return repository.findByNameLike(name+"%").stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }

    @Override
    public List<Patient> getPatientByContact(String contact) {
        return repository.findByContactLike(contact+"%").stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }

    @Override
    public List<Patient> getPatientByNic(String nic) {
        return repository.findByNicLike(nic+"%").stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }

    @Override
    public List<Patient> getPatientByBloodGroup(String bloodGroup) {
        return repository.findByBloodGroup(bloodGroup).stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }

    @Override
    public List<Patient> getPatientByCategory(String category) {
        return repository.findByCategory(category).stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }

    @Override
    public List<Patient> getPatientByAddress(String address) {
        return repository.findByAddressLike(address+"%").stream().map(patientEntity -> mapper.map(patientEntity, Patient.class)).toList();
    }
}
