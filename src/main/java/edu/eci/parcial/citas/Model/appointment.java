package edu.eci.parcial.citas.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "citas")
public class appointment {

    private String name;
    private String cedula;
    private String email;
    private Date fecha;
    private String passwordConfirmation;
    private String speciality;
    private String doctor;
    private String location;

    public appointment() {}

    public appointment(String name, String cedula, String email, Date fecha, String passwordConfirmation, String speciality, String doctor, String location) {
        this.name = name;
        this.cedula = cedula;
        this.email = email;
        this.fecha = fecha;
        this.passwordConfirmation = passwordConfirmation;
        this.speciality = speciality;
        this.doctor = doctor;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}