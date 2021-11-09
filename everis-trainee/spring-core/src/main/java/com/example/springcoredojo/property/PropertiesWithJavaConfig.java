package com.example.springcoredojo.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("foo.properties")
public class PropertiesWithJavaConfig {

    @Value("${soy.una.propiedad}")
    private String nombre;

    @Value("${soy.una.propiedad.que.no.existe:@fmhuber}")
    private String propiedadSinValor;

    @Value("${mi.edad:32}")
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropiedadSinValor() {
        return propiedadSinValor;
    }

    public void setPropiedadSinValor(String propiedadSinValor) {
        this.propiedadSinValor = propiedadSinValor;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
