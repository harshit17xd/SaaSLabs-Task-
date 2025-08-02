package com.clinic.clinic_appointment.service;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.clinic_appointment.model.Doctor;
import com.clinic.clinic_appointment.repository.DoctorRepository;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.addDoctor(doctor);
    }

    public Map<Long, Doctor> getAllDoctors() {
        return doctorRepository.getAllDoctors();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.getDoctorById(id);
    }
}