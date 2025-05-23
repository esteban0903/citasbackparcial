package edu.eci.parcial.citas.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "especialidades")
public class speciality {
    private String name;
    private String description;
    private String doctor;
    private String address;
    private String image;



    public speciality(String name, String description, String doctor, String address, String image) {
        this.name = name;
        this.description = description;
        this.doctor = doctor;
        this.address = address;
        this.image = image;
    }
}