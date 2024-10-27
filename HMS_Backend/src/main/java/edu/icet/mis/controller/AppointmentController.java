package edu.icet.mis.controller;

import edu.icet.mis.dto.Appointment;
import edu.icet.mis.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/appointment")
@RequiredArgsConstructor
public class AppointmentController {

    final AppointmentService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addAppointment(@RequestBody Appointment appointment){
        return "Id:" + service.addAppointment(appointment) + " Appointment added successfully.";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String addAppointment(@PathVariable Integer id){
        service.deleteAppointment(id);
        return "Deleted Successfully.";
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updateAppointment(@RequestBody Appointment appointment){
        return "Id:" + service.addAppointment(appointment) + " Appointment updated successfully.";
    }

    @GetMapping("/get/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAllAppointments(){
        return service.getAllAppointments();
    }

    @GetMapping("/get/id/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Appointment getAppointmentById(@PathVariable Integer id){
        return service.getAppointmentById(id);
    }

    @GetMapping("/get/type/{type}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAppointmentByType(@PathVariable String type){
        return service.getAppointmentByType(type);
    }

    @GetMapping("/get/status/{status}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAppointmentByStatus(@PathVariable String status){
        return service.getAppointmentByStatus(status);
    }

    @GetMapping("/get/room-no/{roomNo}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAppointmentByRoomNo(@PathVariable Integer roomNo){
        return service.getAppointmentByRoomNo(roomNo);
    }

    @GetMapping("/get/patient-id/{patientId}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAppointmentByPatientId(@PathVariable Integer patientId){
        return service.getAppointmentByPatientId(patientId);
    }

    @GetMapping("/get/admin-id/{adminId}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Appointment> getAppointmentByAdminId(@PathVariable Integer adminId){
        return service.getAppointmentByAdminId(adminId);
    }
}
