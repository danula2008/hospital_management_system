package edu.icet.mis.controller;

import edu.icet.mis.dto.Patient;
import edu.icet.mis.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/patient")
public class PatientController {
    private final PatientService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addPatient(@RequestBody Patient patient){
        return "Id:" + service.addPatient(patient) + " Patient added successfully.";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deletePatient(@PathVariable Integer id){
        service.deletePatient(id);
        return "Deleted Successfully";
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String updatePatient(@RequestBody Patient patient){
        return "Id:" + service.addPatient(patient) + " Patient updated successfully.";
    }

    @GetMapping("/get/all")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getAllPatients(){
        return service.getAllPatients();
    }

    @GetMapping("get/id/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Patient getPatientsById(@PathVariable Integer id){
        return service.getPatientById(id);
    }

    @GetMapping("get/name/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByName(@PathVariable String name){
        return service.getPatientByName(name);
    }

    @GetMapping("get/contact/{contact}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByContact(@PathVariable String contact){
        return service.getPatientByContact(contact);
    }

    @GetMapping("get/nic/{nic}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByNic(@PathVariable String nic){
        return service.getPatientByNic(nic);
    }

    @GetMapping("get/blood-group/{bloodGroup}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByBloodGroup(@PathVariable String bloodGroup){
        return service.getPatientByBloodGroup(bloodGroup);
    }

    @GetMapping("get/category/{category}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByCategory(@PathVariable String category){
        return service.getPatientByCategory(category);
    }

    @GetMapping("get/address/{address}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Patient> getPatientsByAddress(@PathVariable String address){
        return service.getPatientByAddress(address);
    }
}