package edu.icet.mis.repository;

import edu.icet.mis.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentDao extends JpaRepository<AppointmentEntity, Integer> {
    List<AppointmentEntity> findByType(String s);
    List<AppointmentEntity> findByStatus(String status);
    List<AppointmentEntity> findByRoomNumber(Integer roomNo);
    List<AppointmentEntity> findByPatientId(Integer patientId);
    List<AppointmentEntity> findByAdminId(Integer adminId);
}
