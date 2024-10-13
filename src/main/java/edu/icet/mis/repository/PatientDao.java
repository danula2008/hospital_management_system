package edu.icet.mis.repository;

import edu.icet.mis.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientDao extends JpaRepository<PatientEntity, Integer> {

    List<PatientEntity> findByNameLike(String name);
    List<PatientEntity> findByContactLike(String contact);
    List<PatientEntity> findByNicLike(String nic);
    List<PatientEntity> findByBloodGroup(String bloodGroup);
    List<PatientEntity> findByCategory(String category);
    List<PatientEntity> findByAddressLike(String address);
}
