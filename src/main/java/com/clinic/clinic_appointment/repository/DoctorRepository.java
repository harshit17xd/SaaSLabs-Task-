package com.clinic.clinic_appointment.repository;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clinic.clinic_appointment.model.Doctor;

@Repository
public class DoctorRepository {
    private final Map<Long, Doctor> doctorMap = new HashMap<>();
    private long currentId = 1;

    // Add a new doctor
    public Doctor addDoctor(Doctor doctor) {
        doctor.setId(currentId++);
        doctorMap.put(doctor.getId(), doctor);
        return doctor;
    }

    // Get all doctors
    public Map<Long, Doctor> getAllDoctors() {
        return doctorMap;
    }

    // Get doctor by ID
    public Doctor getDoctorById(Long id) {
        return doctorMap.get(id);
    }
}