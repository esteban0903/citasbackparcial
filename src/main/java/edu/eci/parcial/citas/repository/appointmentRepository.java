package edu.eci.parcial.citas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.eci.parcial.citas.Model.appointment;

@Repository
public interface appointmentRepository extends MongoRepository<appointment, String> {
    List<appointment> findByEmail(String email);
    List<appointment> findByState(String state);
}