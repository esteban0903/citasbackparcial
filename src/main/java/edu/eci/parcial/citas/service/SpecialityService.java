package edu.eci.parcial.citas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.parcial.citas.Model.speciality;
import edu.eci.parcial.citas.repository.specialityRepository;

@Service
public class SpecialityService {

    @Autowired
    private specialityRepository specialityRepository;

    public List<speciality> getAllSpecialities() {
        return specialityRepository.findAll();
    }

    public speciality getSpecialityByName(String name) {
        return specialityRepository.findById(name).orElseThrow(() -> new IllegalArgumentException("Especialidad no encontrada"));
    }
}