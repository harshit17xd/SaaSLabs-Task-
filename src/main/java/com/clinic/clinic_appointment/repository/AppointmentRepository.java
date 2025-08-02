package com.clinic.clinic_appointment.repository;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clinic.clinic_appointment.model.Appointment;

@Repository
public class AppointmentRepository {
    private final Map<Long, Appointment> appointmentMap = new HashMap<>();
    private long currentId = 1;

    // Book an appointment
    public Appointment bookAppointment(Appointment appointment) {
        appointment.setId(currentId++);
        appointmentMap.put(appointment.getId(), appointment);
        return appointment;
    }

    // Get all appointments
    public Map<Long, Appointment> getAllAppointments() {
        return appointmentMap;
    }

    // Get appointments by doctor ID
    public Map<Long, Appointment> getAppointmentsByDoctor(Long doctorId) {
        Map<Long, Appointment> result = new HashMap<>();
        for (Appointment appointment : appointmentMap.values()) {
            if (appointment.getDoctorId().equals(doctorId)) {
                result.put(appointment.getId(), appointment);
            }
        }
        return result;
    }
}
