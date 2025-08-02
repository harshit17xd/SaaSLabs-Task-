package com.clinic.clinic_appointment.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private Long id;
    private Long doctorId;
    private Long patientId;
    private LocalDateTime slot;  // Appointment slot (date and time)
}