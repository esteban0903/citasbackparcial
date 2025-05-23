package edu.eci.parcial.citas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.eci.parcial.citas.Model.speciality;

@Repository
public interface specialityRepository extends MongoRepository<speciality, String> {}