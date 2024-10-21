package edu.icet.mis.service;

import edu.icet.mis.dto.Appointment;

import java.util.List;

public interface AppointmentService {
    Integer addAppointment(Appointment appointment);
    void deleteAppointment(Integer id);
    List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Integer id);
    List<Appointment> getAppointmentByType(String type);
    List<Appointment> getAppointmentByStatus(String status);
    List<Appointment> getAppointmentByRoomNo(Integer roomNo);
    List<Appointment> getAppointmentByPatientId(Integer patientId);
    List<Appointment> getAppointmentByAdminId(Integer adminId);
}
