package edu.eci.parcial.citas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.parcial.citas.Model.appointment;
import edu.eci.parcial.citas.service.SpecialityService;
import edu.eci.parcial.citas.service.appointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private appointmentService appointmentService;
    private SpecialityService specialityService;

    @PostMapping
    public appointment createAppointment(@RequestBody appointment appointment) {
        return appointmentService.createAppointment(appointment);
    }

    @GetMapping("/{email}")
    public List<appointment> getAppointmentsByEmail(@PathVariable String email) {
        return appointmentService.getAppointmentsByEmail(email);
    }

    @PutMapping("/cancel/{id}")
    public void cancelAppointment(@PathVariable String id) {
        appointmentService.cancelAppointment(id);
    }

    // Nuevo endpoint: Filtrar citas por estado
    @GetMapping("/filter/{state}")
    public List<appointment> getAppointmentsByState(@PathVariable String state) {
        return appointmentService.getAppointmentsByState(state);
    }
}

