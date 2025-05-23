package edu.eci.parcial.citas.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.parcial.citas.Model.speciality;

@RestController
@RequestMapping("/api/specialities")
public class SpecialityController {

    @GetMapping
    public List<speciality> getSpecialities() {
        return Arrays.asList(
                new speciality("Medicina General", "Consulta general", "Dr. Juan Pérez", "Calle 123", "medicina.jpg"),
                new speciality("Psicología", "Consulta psicológica", "Dra. Ana Gómez", "Calle 456", "psicologia.jpg"),
                new speciality("Ortopedia", "Consulta ortopédica", "Dr. Carlos Ruiz", "Calle 789", "ortopedia.jpg"),
                new speciality("Odontología", "Consulta dental", "Dra. Laura Martínez", "Calle 101", "odontologia.jpg")
        );
    }
}