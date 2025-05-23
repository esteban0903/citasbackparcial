package edu.eci.parcial.citas.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.parcial.citas.Model.appointment;
import edu.eci.parcial.citas.repository.appointmentRepository;

@Service
public class appointmentService {

    @Autowired
    private appointmentRepository appointmentRepository;

    public appointment createAppointment(appointment appointment) {
        if (appointment.getFecha().before(new Date())) {
            throw new IllegalArgumentException("La fecha de la cita no puede ser anterior a hoy.");
        }
        return appointmentRepository.save(appointment);
    }

    public List<appointment> getAppointmentsByEmail(String email) {
        return appointmentRepository.findByEmail(email);
    }

    public List<appointment> getAppointmentsByState(String state) {
        return appointmentRepository.findByState(state);
    }
    
    public void cancelAppointment(String id) {
        appointment appointment = appointmentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cita no encontrada"));
        appointment.setSpeciality("Cancelada");
        appointmentRepository.save(appointment);
    }
}