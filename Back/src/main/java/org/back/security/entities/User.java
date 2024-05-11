package org.back.security.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nume;
    private String utilizator;
    private String parola;
    private String rol;

    public User() {}

    public User(Long id, String nume, String utilizator, String parola, String rol) {
        this.id = id;
        this.nume = nume;
        this.utilizator=utilizator;
        this.parola = parola;
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", utilizator='" + utilizator + '\'' +
                ", parola='" + parola + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getUtilizator() {
        return utilizator;
    }

    public String getParola() {
        return parola;
    }

    public String getRol() {
        return rol;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setUtilizator(String utilizator) {
        this.utilizator = utilizator;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
