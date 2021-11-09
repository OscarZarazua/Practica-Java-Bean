package com.example.springcoredojo.NTT;

import org.springframework.stereotype.Component;

@Component
public class Usuario {

    private Alumno alumno;

    public Usuario(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Usuario=" + alumno +
                '}';
    }
}