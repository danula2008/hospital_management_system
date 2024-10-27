package edu.icet.mis.service.impl;

import edu.icet.mis.dto.Appointment;
import edu.icet.mis.entity.AppointmentEntity;
import edu.icet.mis.repository.AppointmentDao;
import edu.icet.mis.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    final ModelMapper mapper;
    final AppointmentDao repository;

    @Override
    public Integer addAppointment(Appointment appointment) {
        return repository.save(mapper.map(appointment, AppointmentEntity.class)).getId();
    }

    @Override
    public void deleteAppointment(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return repository.findAll().stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }

    @Override
    public Appointment getAppointmentById(Integer id) {
        return mapper.map(repository.findById(id), Appointment.class);
    }

    @Override
    public List<Appointment> getAppointmentByType(String type) {
        return repository.findByType(type).stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }

    @Override
    public List<Appointment> getAppointmentByStatus(String status) {
        return repository.findByStatus(status).stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }

    @Override
    public List<Appointment> getAppointmentByRoomNo(Integer roomNo) {
        return repository.findByRoomNumber(roomNo).stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }

    @Override
    public List<Appointment> getAppointmentByPatientId(Integer patientId) {
        return repository.findByPatientId(patientId).stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }

    @Override
    public List<Appointment> getAppointmentByAdminId(Integer adminId) {
        return repository.findByAdminId(adminId).stream().map(appointmentEntity -> mapper.map(appointmentEntity, Appointment.class)).toList();
    }


}
