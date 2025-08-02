package com.clinic.clinic_appointment.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.clinic_appointment.model.Appointment;
import com.clinic.clinic_appointment.repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment bookAppointment(Appointment appointment) {
        return appointmentRepository.bookAppointment(appointment);
    }

    public Map<Long, Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }

    public Map<Long, Appointment> getAppointmentsByDoctor(Long doctorId) {
        return appointmentRepository.getAppointmentsByDoctor(doctorId);
    }
}
